package com.example.myapplicationb7;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
public class MainActivity extends AppCompatActivity {
 Button notify;
 EditText message;
 @Override
 protected void onCreate(Bundle savedInstanceState) {
 super.onCreate(savedInstanceState);
 setContentView(R.layout.activity_main);
 notify = findViewById(R.id.notify);
 message = findViewById(R.id.mess);
 notify.setOnClickListener(new View.OnClickListener() {
 @Override
 public void onClick(View view) {
    //creating Notification channel
    String channelId = "channel1";
    NotificationChannel channel = new NotificationChannel(channelId, "hello", 
   NotificationManager.IMPORTANCE_HIGH);
    NotificationManager nm = 
   (NotificationManager)getSystemService(Context.NOTIFICATION_SERVICE);
    nm.createNotificationChannel(channel);
    //creating the Notification object
    NotificationCompat.Builder mBuilder = new 
   NotificationCompat.Builder(getApplicationContext(),channelId);
    //you may set channel id using
    // mBuilder.setChannelId(channelId);
    mBuilder.setSmallIcon(R.mipmap.ic_launcher); //Will break if excluded
    mBuilder.setContentTitle("Notification!");
    mBuilder.setContentText(message.getText().toString());
    mBuilder.setAutoCancel(true); // makes auto cancel of notification
    //mBuilder.setPriority(NotificationCompat.PRIORITY_DEFAULT); //set priority of notification
    Intent i = new Intent(getApplicationContext(),ReadNotification.class);
    i.putExtra("body", message.getText().toString());
    PendingIntent pi = PendingIntent.getActivity(getApplicationContext(), 0 , i 
   , PendingIntent.FLAG_UPDATE_CURRENT);
    mBuilder.setContentIntent(pi);
    nm.notify(121 ,mBuilder.build());
    }
    });
    }
   }
