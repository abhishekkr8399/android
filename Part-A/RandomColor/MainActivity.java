package com.example.myapplication2;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import java.util.Random;
public class MainActivity extends AppCompatActivity {
 @Override
 protected void onCreate(Bundle savedInstanceState) {
 super.onCreate(savedInstanceState);
 setContentView(R.layout.activity_main);
 Button btn=findViewById(R.id.button);
 btn.setOnClickListener(new View.OnClickListener() {
 @Override
 public void onClick(View view) {
 ConstraintLayout cl=(ConstraintLayout) findViewById(R.id.cl);
 Random gen=new Random();
 
cl.setBackgroundColor(Color.rgb(gen.nextInt(256),gen.nextInt(256),gen.nextInt(256)
));
 }
 });
}
