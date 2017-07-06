package krishna.assignment74;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);// Setting the login page
        //Defining Butoon
        Button login=(Button)findViewById(R.id.button2);
        //Setting onClockListner
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Defining two EditText by their id's
                EditText name=(EditText) findViewById(R.id.editText5);
                EditText password=(EditText) findViewById(R.id.editText6);

                //Creating Bundle to get and pass the data to next activity
                Bundle data=new Bundle();
                data.putString("UserName",name.getText().toString());
                data.putString("Password",password.getText().toString());
                //Creating Intent to link Second activity
                Intent newPage=new Intent(MainActivity.this,Second.class);
                //Passing the Bundle to intent
                newPage.putExtras(data);
                //Starting Intent
                startActivity(newPage);
            }
        });



    }
}
