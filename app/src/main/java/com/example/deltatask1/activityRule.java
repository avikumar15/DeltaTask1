package com.example.deltatask1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class activityRule extends AppCompatActivity {

    Button b3;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rule);

        b3=(Button)findViewById(R.id.b3);

    }

    public void back(View v)
    {
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }

}
