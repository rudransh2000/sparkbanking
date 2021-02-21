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



public class MainActivity extends AppCompatActivity {
    private Button button;
    Button button1;

    String Name;
    String data5;
    //String userdata;


    TextView textView27;
    FirebaseDatabase selfdatabase;
    DatabaseReference selfref;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView27=(TextView)findViewById(R.id.textView27);

        //userdata = getIntent().getStringExtra("Name");
        //Name = getIntent().getStringExtra("Name");
        selfdatabase = FirebaseDatabase.getInstance();
        selfref = selfdatabase.getReference("User").child("Rudransh Kush");





        //textView27=(TextView)findViewById(R.id.textView27);






        //userdata = getIntent().getStringExtra("Name");

        //Name = getIntent().getStringExtra("Name");
        //database = FirebaseDatabase.getInstance();
        //ref = database.getReference("User");



        selfref.child("Current Balance").addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                data5 = snapshot.getValue(String.class);
                textView27.setText(String.valueOf(data5));
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });




        button=(Button)findViewById(R.id.button2);
        button1 = (Button)findViewById(R.id.button1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openall_customers();
            }
        });


        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,history.class);
                startActivity(intent);
            }
        });

    }
    public void openall_customers(){
        Intent intent = new Intent(this, all_customers.class);
        startActivity(intent);
    }


}