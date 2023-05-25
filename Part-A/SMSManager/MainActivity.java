package com.example.myapplication5;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import android.Manifest;
import android.app.PendingIntent;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import java.net.URI;
public class MainActivity extends AppCompatActivity {
 @Override
 protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    ActivityCompat.requestPermissions(this,new 
   String[]{Manifest.permission.SEND_SMS},1);
   EditText num=findViewById(R.id.editText1);
   EditText msg=findViewById(R.id.editText2);
   Button btn=findViewById(R.id.button);
   btn.setOnClickListener(new View.OnClickListener() {
   @Override
   public void onClick(View view) {
   String phone=num.getText().toString();
   String mesg=msg.getText().toString();
   //Get the SmsManager instance and call the sendTextMessage method 
  to send message
   SmsManager sms = SmsManager.getDefault();
   sms.sendTextMessage(phone,null,mesg,null,null);
   Toast.makeText(getApplicationContext(), "Message Sent 
  successfully!", Toast.LENGTH_LONG).show();
   }
   });
   }
  }