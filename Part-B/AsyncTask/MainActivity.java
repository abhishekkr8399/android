package com.example.myapplicationb2;
import androidx.appcompat.app.AppCompatActivity;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity implements View.OnClickListener 
{
 ProgressBar pb;
 Button start;
 TextView count;
 @Override
 protected void onCreate(Bundle savedInstanceState) {
 super.onCreate(savedInstanceState);
 setContentView(R.layout.activity_main);
 pb = (ProgressBar) findViewById(R.id.progressbar);
 pb.setMax(1000);
 start = (Button) findViewById(R.id.button);
 count = (TextView) findViewById(R.id.textView);
 start.setOnClickListener(this);
 }
 class T extends AsyncTask<String, Integer, String> {
 @Override
 protected String doInBackground(String... strings) {
 int max = Integer.parseInt(strings[0]);
 int i = 0;
 while (i < max) {
 try {
 Thread.sleep(1000);
 } catch (InterruptedException e) {
 e.printStackTrace();
 }
 i++;
 publishProgress(i);
 }
 return null;
 }
 @Override
 protected void onProgressUpdate(Integer... values) {
 pb.setProgress(values[0]);
 count.setText(values[0].toString());
 super.onProgressUpdate();
}
}
@Override
public void onClick(View view) {
T t = new T();
t.execute("1000");
}
}