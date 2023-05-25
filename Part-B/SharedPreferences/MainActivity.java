package com.example.myapplicationb9;
import androidx.appcompat.app.AppCompatActivity;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {
 EditText uname,uphone,uemail;
 Button add,delete,display;
 public static final String Myprefs="MyPrefs";
 public static final String Name="NameKey";
 public static final String Phone="PhoneKey";
 public static final String Email="EmailKey";
 SharedPreferences sp;
 SharedPreferences.Editor er;
 @Override
 protected void onCreate(Bundle savedInstanceState) {
 super.onCreate(savedInstanceState);
 setContentView(R.layout.activity_main);
 add=findViewById(R.id.button1);
 delete=findViewById(R.id.button2);
 display=findViewById(R.id.button3);
 uname=findViewById(R.id.editText1);
 uphone=findViewById(R.id.editText2);
 uemail=findViewById(R.id.editText3);
 sp=getSharedPreferences(Myprefs,MODE_PRIVATE);
 add.setOnClickListener(new View.OnClickListener() {
 @Override
 public void onClick(View view) {
 String name=uname.getText().toString();
 String phone=uphone.getText().toString();
 String email=uemail.getText().toString();
 er=sp.edit();
 er.putString(Name,name);
 er.putString(Phone,phone);
 er.putString(Email,email);
 er.commit();
 
Toast.makeText(MainActivity.this,"Thanks",Toast.LENGTH_SHORT).show();
 }
 });
 delete.setOnClickListener(new View.OnClickListener() {
 @Override
 public void onClick(View view) {
 er=sp.edit();
 er.clear();
 er.commit();
 }
 });
 display.setOnClickListener(new View.OnClickListener() {
 @Override
 public void onClick(View view) {
    String s;
    s="Name: "+sp.getString(Name,null)+"Email: "+sp.getString(Email,null) +" Phone: "+sp.getString(Phone,null);
    Toast.makeText(MainActivity.this,s,Toast.LENGTH_SHORT).show();
    }
    });
    }
   }
   
