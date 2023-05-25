package com.example.myapplication3;
import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
public class MainActivity extends AppCompatActivity {
 @Override
 protected void onCreate(Bundle savedInstanceState) {
 super.onCreate(savedInstanceState);
 setContentView(R.layout.activity_main);
 ActionBar actionBar=getSupportActionBar();
 actionBar.setTitle("Main Activity");
}
@Override
public boolean onCreateOptionsMenu(Menu menu) {
MenuInflater inflater=getMenuInflater();
inflater.inflate(R.menu.options,menu);
return super.onCreateOptionsMenu(menu);
}
@Override
public boolean onOptionsItemSelected(@NonNull MenuItem item) {
switch(item.getItemId()){
case R.id.f1:
startActivity(new Intent(this,MainActivity2.class));
return true;
case R.id.f2:
startActivity(new Intent(this,MainActivity3.class));
return true;
default:
return super.onOptionsItemSelected(item);
}
}
}
