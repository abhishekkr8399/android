mport androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import android.Manifest;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    ActivityCompat.requestPermissions(this,new 
   String[]{Manifest.permission.CALL_PHONE},1);
    EditText num=findViewById(R.id.editText);
    Button call=findViewById(R.id.button);
    call.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
    String number=num.getText().toString();
    Intent callintent=new Intent(Intent.ACTION_CALL);
    callintent.setData(Uri.parse("tel:"+number));
    try {
    startActivity(callintent);
    }catch (Exception e){
    Log.d("error",e.getMessage());
    Toast.makeText(getApplicationContext(),"call permission 
   denied",Toast.LENGTH_SHORT).show();
    }
    }
    });
    }
   }