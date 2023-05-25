package com.example.myapplicationb8;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
public class MainActivity extends AppCompatActivity {
 Button load;
 Button defalt;
 EditText url;
 @Override
 protected void onCreate(Bundle savedInstanceState) {
 super.onCreate(savedInstanceState);
 setContentView(R.layout.activity_main);
 defalt= findViewById(R.id.button1);
 load=findViewById(R.id.button2);
 url=findViewById(R.id.editText);
 defalt.setOnClickListener(new View.OnClickListener() {
 @Override
 public void onClick(View view) {
 Intent i=new Intent(getApplicationContext(),MainActivity2.class);
 i.putExtra("load","d");
 startActivity(i);
 }
 });
 load.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
    Intent i=new Intent(getApplicationContext(),MainActivity2.class);
    i.putExtra("load",url.getText().toString());
    startActivity(i);
    }
    });
    }
   }
   