package com.example.myapplicationb5;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import android.Manifest;
import android.content.ContentValues;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {
 SQLiteDatabase db;
 Button insert, call;
 EditText name, usn, phone , callUsn;
 @Override
 protected void onCreate(Bundle savedInstanceState) {
 super.onCreate(savedInstanceState);
 setContentView(R.layout.activity_main);
 ActivityCompat.requestPermissions(this, new 
String[]{Manifest.permission.CALL_PHONE}, 1);
 db = new SQL(this).getWritableDatabase();
 insert = findViewById(R.id.insertButton);
 call = findViewById(R.id.callButton);
 name = findViewById(R.id.name_input);
 usn = findViewById(R.id.usn_input);
 phone = findViewById(R.id.phone_input);
 callUsn = findViewById(R.id.call_usn_input);
 insert.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
    String inpName, inpUSN, inpPhone;
    inpName = name.getText().toString();
    inpUSN = usn.getText().toString();
    inpPhone = phone.getText().toString();
    if(inpName.equals("") || inpUSN.equals("") || inpPhone.equals(""))
    {
        Toast.makeText(getApplicationContext(), "Enter all values", 
        Toast.LENGTH_SHORT).show();
         }
         else
         {
         ContentValues values = new ContentValues();
         values.put("name", inpName);
         values.put("usn", inpUSN); values.put("phone", inpPhone);
         db.insert("student", null, values);
         Toast.makeText(getApplicationContext(), "Inserted!", 
        Toast.LENGTH_SHORT).show();
         }
         }
         });
         call.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View view) {
         String usn = callUsn.getText().toString();
         if(usn.equals(""))
         {
            Toast.makeText(getApplicationContext(), "Enter an USN!", 
            Toast.LENGTH_SHORT).show();
             }
             else {
             Cursor cursor = db.rawQuery("select * from student where usn = '" 
            + usn + "'", null);
             //dont forget the single quotes
             if (cursor.getCount() != 1) {
             Toast.makeText(getApplicationContext(), "Student not found!", 
            Toast.LENGTH_SHORT).show();
             }
             else
             {
                cursor.moveToNext();
                String phNumber = cursor.getString(2); //column 3 has phone 
               number
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:" + phNumber));
                try {
                startActivity(callIntent);
                } catch (Exception e) {
                Toast.makeText(getApplicationContext(), "call permission 
               denied", Toast.LENGTH_SHORT).show();
                //add this in manifest
                // <uses-permission 
               android:name="android.permission.CALL_PHONE" />
                }
                }
                }
                }
                });
                }
               }
               