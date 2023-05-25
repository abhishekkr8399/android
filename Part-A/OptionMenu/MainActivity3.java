package com.example.myapplication3;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
public class MainActivity3 extends AppCompatActivity {
 @Override
 protected void onCreate(Bundle savedInstanceState) {
 super.onCreate(savedInstanceState);
 setContentView(R.layout.activity_main3);
 ActionBar actionBar = getSupportActionBar();
 actionBar.setTitle("Second Activity");
 Button btn2 = findViewById(R.id.button2);
 btn2.setOnClickListener(new View.OnClickListener() {
 @Override
 public void onClick(View view) {
 Intent i = new Intent(getApplicationContext(), MainActivity.class);
 startActivity(i);
 }
 });
 }
}
