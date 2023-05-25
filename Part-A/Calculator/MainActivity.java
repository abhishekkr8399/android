package com.example.myapplication10;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity implements 
View.OnClickListener {
 EditText f, s;
 TextView result;
 Button add, sub, mul, div, cls;
@Override
 protected void onCreate(Bundle savedInstanceState) {
 super.onCreate(savedInstanceState);
 setContentView(R.layout.activity_main);
 f = findViewById(R.id.num1);
 s = findViewById(R.id.num2);
 result = findViewById(R.id.result);
 add = findViewById(R.id.add);
 sub = findViewById(R.id.sub);
 mul = findViewById(R.id.mul);
 div = findViewById(R.id.div);
 cls = findViewById(R.id.clear);
 add.setOnClickListener(MainActivity.this);
 sub.setOnClickListener(MainActivity.this);
 mul.setOnClickListener(MainActivity.this);
 div.setOnClickListener(MainActivity.this);
 cls.setOnClickListener(MainActivity.this);
 }
 @Override
 public void onClick(View view) {
 int n1 = Integer.parseInt(f.getText().toString());
 int n2 = Integer.parseInt(s.getText().toString());
 result.setText("");
 switch (view.getId())
 {
 case R.id.add:
 result.setText(n1 + " + " + n2 + " = " + (n1+n2));
 break;
 case R.id.sub:
 result.setText(n1 + " - " + n2 + " = " + (n1-n2));
 break;
 case R.id.mul:
 result.setText(n1 + " x " + n2 + " = " + (n1*n2));
 break;
 case R.id.div:
 result.setText(n1 + " / " + n2 + " = " + (n1/n2));
 break;
 case R.id.clear:
 f.setText("");
 s.setText("");
 break;
 }
 }
 
}
