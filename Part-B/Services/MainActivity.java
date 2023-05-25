package com.example.myapplicationb1;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import java.util.Random;
public class MainActivity extends AppCompatActivity {
 Button play,stop,color;
 @Override
 protected void onCreate(Bundle savedInstanceState) {
 super.onCreate(savedInstanceState);
 setContentView(R.layout.activity_main);
 play=findViewById(R.id.button1);
 stop=findViewById(R.id.button2);
 color=findViewById(R.id.button3);
 play.setOnClickListener(new View.OnClickListener() {
 @Override
 public void onClick(View view) {
 startService(new Intent(getApplicationContext(),MusicService.class));
 }
 });
 stop.setOnClickListener(new View.OnClickListener() {
 @Override
 public void onClick(View view) {
 stopService(new Intent(getApplicationContext(),MusicService.class));
 }
 });
 color.setOnClickListener(new View.OnClickListener() {
 @Override
 public void onClick(View view) {
 ConstraintLayout cl=findViewById(R.id.cl);
 Random gen=new Random();
 
cl.setBackgroundColor(Color.rgb(gen.nextInt(255),gen.nextInt(255),gen.nextInt(255)
));
 }
 });
 }
}