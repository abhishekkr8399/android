package com.example.myapplication4;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import android.graphics.Color;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    TextView t1 = findViewById(R.id.textview);
    registerForContextMenu(t1);
    }
    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, 
   ContextMenu.ContextMenuInfo menuInfo) {
    super.onCreateContextMenu(menu, v, menuInfo);
    MenuInflater inflater = getMenuInflater();
    inflater.inflate(R.menu.options,menu);
    }
    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
    ConstraintLayout cl=findViewById(R.id.cl);
    switch (item.getItemId())
    {
    case R.id.red:
    cl.setBackgroundColor(Color.RED);
    return true;
    case R.id.blue:
    cl.setBackgroundColor(Color.BLUE);
    return true;
    case R.id.green:
    cl.setBackgroundColor(Color.GREEN);
    return true;
    }
    return super.onContextItemSelected(item);
    }
   }