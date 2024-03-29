package com.example.myapplicationb10;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
public class MainActivity extends AppCompatActivity {
 ImageView imageView;
 Button blinkBTN, rotateBTN, moveBTN, zoomBTN;
 @Override
 protected void onCreate(Bundle savedInstanceState) {
 super.onCreate(savedInstanceState);
 setContentView(R.layout.activity_main);
 imageView = findViewById(R.id.imageView);
 blinkBTN = findViewById(R.id.blink);
 rotateBTN=findViewById(R.id.rotate);
 moveBTN=findViewById(R.id.move);
 zoomBTN=findViewById(R.id.zoom);
 blinkBTN.setOnClickListener(new View.OnClickListener() {
 @Override
 public void onClick(View view) {
    Animation animation = 
    AnimationUtils.loadAnimation(getApplicationContext(), R.anim.blink_anim);
    imageView.startAnimation(animation);
}
});
rotateBTN.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
    Animation animation = 
   AnimationUtils.loadAnimation(getApplicationContext(), R.anim.rotate_anim);
    imageView.startAnimation(animation);
    }
    });
    moveBTN.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
    Animation animation = 
   AnimationUtils.loadAnimation(getApplicationContext(), R.anim.move_anim);
    imageView.startAnimation(animation);
    }
    });
    zoomBTN.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
    Animation animation = 
   AnimationUtils.loadAnimation(getApplicationContext(), R.anim.zoom_anim);
    imageView.startAnimation(animation);
    }
    });
    }
}
   