package com.example.myapplication9;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
public class MainActivity extends AppCompatActivity {
 @Override
 protected void onCreate(Bundle savedInstanceState) {
 super.onCreate(savedInstanceState);
 setContentView(R.layout.activity_main);
 Button bt=findViewById(R.id.button);
 bt.setOnClickListener(new View.OnClickListener() {
 @Override
 public void onClick(View view) {
 Intent i=new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
 startActivityForResult(i,1);
 }
 });
 }
 @Override
 protected void onActivityResult(int requestCode, int resultCode, @Nullable 
 Intent data) {
  if(requestCode==1 && resultCode==RESULT_OK)
  {
  Bitmap image = (Bitmap) data.getExtras().get("data");
  BitmapDrawable drawable= new BitmapDrawable(image);
  ConstraintLayout r=findViewById(R.id.cl);
  r.setBackground(drawable);
  }
  super.onActivityResult(requestCode, resultCode, data);
  }
 }
 
