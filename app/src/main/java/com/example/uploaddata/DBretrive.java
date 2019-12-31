package com.example.uploaddata;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.HashMap;

public class DBretrive extends AppCompatActivity {
    FirebaseDatabase db =FirebaseDatabase.getInstance();
    DatabaseReference rootRef = db.getReference();
    DatabaseReference userRe = rootRef.child("MEMBERS");
    DatabaseReference bopaiah = userRe.child("KG BOPAIAH");
    DatabaseReference appachu = userRe.child("APPACHU RANJAN");

    EditText username,name,email;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dbretrive);


        username=findViewById(R.id.username);
        name=findViewById(R.id.name);
        email=findViewById(R.id.email);

        button=findViewById(R.id.button);

        final String myValue = getIntent().getStringExtra("namebdm");




        button.setOnClickListener(new View.OnClickListener() {
            @Override
             public void onClick(View v) {


                String myUserName = username.getText().toString().trim();
                String myName= name.getText().toString().trim();
                String myEmail = email.getText().toString().trim();


                HashMap<String,String> userMap = new HashMap<String, String>();
                userMap.put("Username",myUserName);
                userMap.put("Name",myName);
                userMap.put("Email",myEmail);



                if (myValue.equals("bopaiah")){

                    bopaiah.push().setValue(userMap).addOnCompleteListener(new OnCompleteListener<Void>() {
                        @Override
                        public void onComplete(@NonNull Task<Void> task) {
                            if(task.isSuccessful()){
                                Toast.makeText(DBretrive.this,"Success",Toast.LENGTH_SHORT).show();
                            }

                        }
                    });
                }
                if (myValue.equals("appachu")){

                    appachu.push().setValue(userMap).addOnCompleteListener(new OnCompleteListener<Void>() {
                        @Override
                        public void onComplete(@NonNull Task<Void> task) {
                            if(task.isSuccessful()){
                                Toast.makeText(DBretrive.this,"Success",Toast.LENGTH_SHORT).show();
                            }

                        }
                    });
                }





                // IF STATEMENT

                }
               }
        );
    }
}
