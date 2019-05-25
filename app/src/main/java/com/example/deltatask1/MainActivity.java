package com.example.deltatask1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_NUMBER = "com.deltatask1.application.deltatask1.EXTRA_NUMBER";

    EditText et1;
    Button b1,b2;
    TextView t4;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        t4=(TextView)findViewById(R.id.t4);

        et1=(EditText)findViewById(R.id.et1);

        b1=(Button)findViewById(R.id.b1);
        b2=(Button)findViewById(R.id.b2);

        et1.setText("");

    }

    public void rule (View v)
    {
        Intent intent = new Intent(this, activityRule.class);
        startActivity(intent);
    }

    public void go1 (View view)
    {
        t4.setText("");
        int i=0;
        if(!(et1.getText().toString().equals("")))
        i=Integer.parseInt(et1.getText().toString());
        if(i<=0||i>100)
        {
            t4.setText("INVALID INPUT. Modify and hit GO.");
        }
        else
        {
            Intent intent = new Intent(this,guessActivity.class);
            intent.putExtra(EXTRA_NUMBER,i);
            startActivity(intent);
        }
    }
}
