package krishna.assignment74;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Second extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);//Setting the Welcome page
        //Defining TextView
        TextView name=(TextView)findViewById(R.id.text) ;
        //Getting data Bundle from previous Intent and setting it in a TextView
        String Name= getIntent().getExtras().getString("UserName");
        name.setText(Name);

    }
}
