package com.example.uploaddata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class mla extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mla);


    }

    public void bWork(View view){

        String value ="bopaiah";

        Intent intent= new Intent(mla.this ,DBretrive.class);
        intent.putExtra("namebdm",value);// sending the value to the  Main2Activity from Mainactivity
        startActivity(intent);



    }
    public void aWork(View view){

        String value ="appachu";

        Intent intent= new Intent(mla.this ,DBretrive.class);
        intent.putExtra("namebdm",value);// sending the value to the  Main2Activity from Mainactivity
        startActivity(intent);



    }
}
