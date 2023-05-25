package com.example.myapplicationb6;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
public class ResumeView extends AppCompatActivity {
    ImageView profilePic;
    TextView name, qualification, email, phone, gender;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_resume_view);
    name = findViewById(R.id.user_profile_name);
    gender = findViewById(R.id.user_gender);
    qualification = findViewById(R.id.uquali);
    email = findViewById(R.id.uemail);
    phone = findViewById(R.id.uphone);
    profilePic = findViewById(R.id.uprofilePic);
    Intent i = getIntent();
    name.setText(i.getStringExtra("name"));
    gender.setText(i.getStringExtra("gender"));
    email.setText("email:" + i.getStringExtra("email"));
    phone.setText("Phone:" + i.getStringExtra("phone"));
    qualification.setText("Qualification:" + i.getStringExtra("Qualification"));
    if (MainActivity.profilepic != null) {
    profilePic.setImageBitmap(MainActivity.profilepic);
    }
    }
   }