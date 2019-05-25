package com.example.deltatask1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;



public class finalActivity extends AppCompatActivity {

    TextView t2,t3,t10;
    Button b6;
    static int k=0,p=0;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final);

        t10=(TextView)findViewById(R.id.t10);
        t2=(TextView)findViewById(R.id.t2);
        t3=(TextView)findViewById(R.id.t3);

        b6=(Button)findViewById(R.id.b6);

        Intent intent2 = getIntent();
        int a=intent2.getIntExtra(guessActivity.EXTRA_NUMBER2,0);      //wins

        p++;

        if(a==5)
        {
            k++;
            t10.setText("Game Won");
        }
        else
        {
            t10.setText("Game Lost");
        }
        t2.setText("Games won - "+k);
        t3.setText("Games lost - "+(p-k));
    }



    public void Startover(View v)
    {
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);                                                              //call activity main.
    }
}
