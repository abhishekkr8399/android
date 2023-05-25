package com.example.myapplicationb7;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
public class ReadNotification extends AppCompatActivity {
 TextView message;
 @Override
 protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_read_notification);
    message = findViewById(R.id.message);
    String mes=getIntent().getStringExtra("body");
    message.setText(mes);
    }
   }