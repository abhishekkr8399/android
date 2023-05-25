package com.example.myapplication8;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.DatePicker;
import android.widget.ListView;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {
 String[] branch ={"CSE", "ECE", "EEE", "Mech"};
 @Override
 protected void onCreate(Bundle savedInstanceState) {
 super.onCreate(savedInstanceState);
 setContentView(R.layout.activity_main);
 ArrayAdapter a= new ArrayAdapter(this, 
android.R.layout.simple_list_item_1,branch);
 ListView lv=findViewById(R.id.li);
 DatePicker d=findViewById(R.id.dp);
 lv.setAdapter(a);
 lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
 @Override
 public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) 
{
 String date=d.getDayOfMonth()+"/"+d.getMonth()+"/"+d.getYear();
 Toast.makeText(getApplicationContext(),"Join date is:"+date+"\nSelected 
branch is:"+branch[i],Toast.LENGTH_SHORT).show();
}
});
 }
}