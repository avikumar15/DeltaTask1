package com.example.deltatask1;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.res.Configuration;
import android.graphics.Color;
import android.support.annotation.ColorInt;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import static android.content.Intent.EXTRA_TEXT;
import static android.view.View.INVISIBLE;

public class guessActivity extends AppCompatActivity {

    public static final String EXTRA_NUMBER2="com.example.deltatask1.example.EXTRA_NUMBER2";

    EditText et2;
    Button b4,b5,b7;
    TextView t1,t5,t6,tease,t12,degreee;
    LinearLayout root,colour;


    int k=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guess);

        et2=(EditText)findViewById(R.id.et2);

        b4=(Button)findViewById(R.id.b4);
        b5=(Button)findViewById(R.id.b5);
        b7=(Button)findViewById(R.id.b7);


        t1=(TextView)findViewById(R.id.t1);
        t5=(TextView)findViewById(R.id.t5);
        t6=(TextView)findViewById(R.id.t6);
        t12=(TextView)findViewById(R.id.t12);
        degreee=(TextView)findViewById(R.id.degreee);
        tease=(TextView)findViewById(R.id.tease);

        colour=(LinearLayout)findViewById(R.id.colour);
        root=(LinearLayout)findViewById(R.id.LinLay);

        et2.setText("");

        b7.setVisibility(INVISIBLE);

        t1.setText("Tries Left - "+(5-k));

    }


    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        setContentView(R.layout.activity_guess);

        et2=(EditText)findViewById(R.id.et2);

        b4=(Button)findViewById(R.id.b4);
        b5=(Button)findViewById(R.id.b5);
        b7=(Button)findViewById(R.id.b7);


        t1=(TextView)findViewById(R.id.t1);
        t5=(TextView)findViewById(R.id.t5);
        t6=(TextView)findViewById(R.id.t6);
        t12=(TextView)findViewById(R.id.t12);
        degreee=(TextView)findViewById(R.id.degreee);
        tease=(TextView)findViewById(R.id.tease);

        colour=(LinearLayout)findViewById(R.id.colour);
        root=(LinearLayout)findViewById(R.id.LinLay);

        et2.setText("");

        b7.setVisibility(INVISIBLE);


        t1.setText("Tries Left - "+(5-k));
    }



    int a=0,b=0;
    int flag=0;
    public void go2 (View view)
    {
        t5.setText("");
        Intent intent=getIntent();
        int p;
        p=intent.getIntExtra(MainActivity.EXTRA_NUMBER, 0);

        int j=0;

        if(!(et2.getText().toString().equals("")))
        j=Integer.parseInt(et2.getText().toString());

        if((j<=0||j>100))
        {
            t5.setText("INVALID Input. Modify and hit go.");
        }

        else if(k<=5)
        {
            k++;
            t1.setText("Tries Left - "+(5-k));

            if(p>j&&flag==0)
            {
                if(((-100*(j-p))/p)<=10)
                    root.setBackgroundColor(Color.parseColor("#00FF00"));

                else if((-(100*(j-p))/p)<=20)
                    root.setBackgroundColor(Color.parseColor("#66ff00"));

                else if(((-100*(j-p))/p)<=30)
                    root.setBackgroundColor(Color.parseColor("#99ff00"));

                else if(((-100*(j-p))/p)<=40)
                    root.setBackgroundColor(Color.parseColor("#ccff00"));

                else if(((-100*(j-p))/p)<=50)
                    root.setBackgroundColor(Color.parseColor("#FFFF00"));

                else if(((-100*(j-p))/p)<=60)
                    root.setBackgroundColor(Color.parseColor("#FFCC00"));

                else if(((-100*(j-p))/p)<=70)
                    root.setBackgroundColor(Color.parseColor("#ff9900"));

                else if(((-100*(j-p))/p)<=80)
                    root.setBackgroundColor(Color.parseColor("#ff6600"));

                else if(((-100*(j-p))/p)<=90)
                    root.setBackgroundColor(Color.parseColor("#FF3300"));

                else
                root.setBackgroundColor(Color.parseColor("#FF0000"));

                a++;                                                //Guess age lesser
            }

            else if(p<j&&flag==0)
            {
                a++;
                if(((100*(j-p))/p)<=10)
                    root.setBackgroundColor(Color.parseColor("#00FF00"));
                                                                                                        //Guesed age is grater
                else if(((100*(j-p))/p)<=20)
                    root.setBackgroundColor(Color.parseColor("#66ff00"));

                else if(((100*(j-p))/p)<=30)
                    root.setBackgroundColor(Color.parseColor("#99ff00"));

                else if(((100*(j-p))/p)<=40)
                    root.setBackgroundColor(Color.parseColor("#ccff00"));

                else if(((100*(j-p))/p)<=50)
                    root.setBackgroundColor(Color.parseColor("#FFFF00"));

                else if(((100*(j-p))/p)<=60)
                    root.setBackgroundColor(Color.parseColor("#FFCC00"));

                else if(((100*(j-p))/p)<=70)
                    root.setBackgroundColor(Color.parseColor("#ff9900"));

                else if(((100*(j-p))/p)<=80)
                    root.setBackgroundColor(Color.parseColor("#ff6600"));

                else if(((100*(j-p))/p)<=90)
                    root.setBackgroundColor(Color.parseColor("#FF3300"));

                else
                    root.setBackgroundColor(Color.parseColor("#FF0000"));

            }

            else if(flag==0)
            {
                root.setBackgroundColor(Color.parseColor("#00FF00"));                       //Equal
                b=5;
                b4.setVisibility(INVISIBLE);
                et2.setText("");
                et2.setVisibility(INVISIBLE);
                b7.setVisibility(View.VISIBLE);
                t12.setText("That was a correct guess");
                t6.setVisibility(INVISIBLE);
                tease.setVisibility(INVISIBLE);
                b5.setVisibility(INVISIBLE);
                t5.setText("");
                t1.setText("");
            }

            if(k==5)
            {
                flag=1;
                b4.setVisibility(INVISIBLE);
                et2.setText("");
                et2.setVisibility(INVISIBLE);
                b7.setVisibility(View.VISIBLE);
                if(p!=j)
                t12.setText("Game Lost");
                t6.setVisibility(INVISIBLE);
                tease.setVisibility(INVISIBLE);
                b5.setVisibility(INVISIBLE);
                t5.setText("");
                t1.setText("");
            }

        et2.setText("");

        }
    }

    public void go5 (View view)
    {
        Intent intent6 = new Intent(this,finalActivity.class);
        intent6.putExtra(EXTRA_NUMBER2,b);
        startActivity(intent6);
    }

    public void restart (View v)
    {
        Intent intent3 = new Intent(this,MainActivity.class);
        startActivity(intent3);
    }
}
