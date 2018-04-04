package com.jorgeazzufranco.activitiesintents;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void segundaPantalla(View v){
        Intent sndScreenIntent = new Intent(getApplicationContext(), Main2Activity.class);
        startActivity(sndScreenIntent);
    }
}
