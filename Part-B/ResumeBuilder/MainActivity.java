package com.example.myapplicationb6;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
public class MainActivity extends AppCompatActivity {
 EditText name, email, phone, qualif;
 Button Pic, submit;
 RadioGroup gender;
 RadioButton r;
 ImageView profilePic;
 public static Bitmap profilepic;
 @Override
 protected void onActivityResult(int requestCode, int resultCode, @Nullable 
Intent data) {
 if(requestCode==1 && resultCode==RESULT_OK)
 {
 profilepic = (Bitmap)data.getExtras().get("data");
 profilePic.setImageBitmap(profilepic);
 }
 super.onActivityResult(requestCode, resultCode, data);
 }
 @Override
 protected void onCreate(Bundle savedInstanceState) {
 super.onCreate(savedInstanceState);
 setContentView(R.layout.activity_main);
 name = findViewById(R.id.name_input);
 email = findViewById(R.id.email_input);
 phone = findViewById(R.id.phone_input);
 qualif = findViewById(R.id.quali_input);
 Pic = findViewById(R.id.takepic);
 submit = findViewById(R.id.submit);
 gender = findViewById(R.id.gender_group);
 Pic = findViewById(R.id.takepic);
 submit = findViewById(R.id.submit);
 profilePic = findViewById(R.id.profilePic);
 submit.setOnClickListener(new View.OnClickListener() {
 @Override
 public void onClick(View view) {
 Intent i = new Intent(getApplicationContext(), ResumeView.class);
 i.putExtra("name", name.getText().toString());
 i.putExtra("Qualification", qualif.getText().toString());
 i.putExtra("email", email.getText().toString());
 i.putExtra("phone", phone.getText().toString());
 int gid = gender.getCheckedRadioButtonId();
 r=findViewById(gid);
 String gstr = r.getText().toString();
 i.putExtra("gender", gstr);
 startActivity(i);
 }
 });
 Pic.setOnClickListener(new View.OnClickListener() {
 @Override
 public void onClick(View view) {
 Intent Pici=new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
 startActivityForResult(Pici,1);
 }
 });
 }
}