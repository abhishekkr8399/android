package com.example.myapplication7;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import java.util.Random;
public class MainActivity extends AppCompatActivity {
 int [] back_images;
 @Override
 protected void onCreate(Bundle savedInstanceState) {
 super.onCreate(savedInstanceState);
 setContentView(R.layout.activity_main);
 ConstraintLayout r=findViewById(R.id.cl);
 Button b1=findViewById(R.id.button);
 b1.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
    AlertDialog.Builder b=new AlertDialog.Builder(MainActivity.this);
    b.setTitle("BackGround Image Changer");
    b.setMessage("Are you sure you want to change background image?");
    back_images=new 
   int[]{R.drawable.picture1,R.drawable.picture2,R.drawable.picture3,R.drawable.picture
   4};
    b.setPositiveButton("yes", new DialogInterface.OnClickListener() {
    @Override
    public void onClick(DialogInterface dialogInterface, int i) {
    int arrlength=back_images.length;
    Random gen=new Random();
    int ran_no=gen.nextInt(4);
    
   r.setBackground(ContextCompat.getDrawable(getApplicationContext(),back_images[r
   an_no]));
    }
    });
    b.setNegativeButton("no", new DialogInterface.OnClickListener() {
    @Override
    public void onClick(DialogInterface dialogInterface, int i) {
    }
    });
    b.show();
}
});
}
}