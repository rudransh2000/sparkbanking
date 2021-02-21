package com.example.sparkbanking;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class shubham_detail extends AppCompatActivity {
    private Button button;

    String Name;
    String userdata;
    String data;
    String data1;
    String data2;
    String data3;

    //String data99;



    TextView textView6;
    TextView textView7;
    TextView textView8;
    TextView textView9;

    //TextView textView99;
    FirebaseDatabase database;
    DatabaseReference ref;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shubham_detail);





        button=(Button)findViewById(R.id.button12);



        textView6=(TextView)findViewById(R.id.textView6);
        textView7=(TextView)findViewById(R.id.textView7);
        textView8=(TextView)findViewById(R.id.textView8);
        textView9=(TextView)findViewById(R.id.textView9);

        //textView99=(TextView)findViewById(R.id.textView99);



        userdata = getIntent().getStringExtra("Name");

        Name = getIntent().getStringExtra("Name");
        database = FirebaseDatabase.getInstance();
        ref = database.getReference("User");

        //ref.child(Name).child("Current Balance").addListenerForSingleValueEvent(new ValueEventListener() {
            //@Override
            //public void onDataChange(@NonNull DataSnapshot snapshot) {
                //data99 = snapshot.getValue(String.class);
                //textView99.setText(String.valueOf(data99));
            //}

            //@Override
            //public void onCancelled(@NonNull DatabaseError error) {

            //}
        //});




        ref.child(Name).child("Name").addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                data = snapshot.getValue(String.class);
                textView6.setText(String.valueOf(data));
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });

        ref.child(Name).child("Mobile Number").addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                data1 = snapshot.getValue(String.class);
                textView7.setText(String.valueOf(data1));
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });

        ref.child(Name).child("Account Number").addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                data2 = snapshot.getValue(String.class);
                textView8.setText(String.valueOf(data2));
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });

        ref.child(Name).child("Current Balance").addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                data3 = snapshot.getValue(String.class);
                textView9.setText(String.valueOf(data3));
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ExampleDialog exampleDialog = new ExampleDialog(userdata);
                exampleDialog.show(getSupportFragmentManager(),"example dialog");

            }
        });


    }





}