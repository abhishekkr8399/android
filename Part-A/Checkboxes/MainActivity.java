package com.example.myapplication1;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {
 @Override
 protected void onCreate(Bundle savedInstanceState) {
 super.onCreate(savedInstanceState);
 setContentView(R.layout.activity_main);
 CheckBox c1= findViewById(R.id.checkBox1);
 CheckBox c2= findViewById(R.id.checkBox2);
 CheckBox c3= findViewById(R.id.checkBox3);
 Button b= findViewById(R.id.button);
 b.setOnClickListener(new View.OnClickListener() {
 @Override
 public void onClick(View view) {
    int total=0;
    StringBuilder s=new StringBuilder();
    if(c1.isChecked()){
    s.append("\nRice\t:\tRs.100");
    total+=100;
    }
    if(c2.isChecked()){
    s.append("\nBread\t:\tRs.70");
    total+=70;
    }
    if(c3.isChecked()){
    s.append("\nCake\t:\tRs.50");
    total+=50;
    }
    s.append("\nTotal:-\t Rs."+total+"/-");
    
   Toast.makeText(getApplicationContext(),s.toString(),Toast.LENGTH_LONG).show();
    }
    });
    }
   }
   