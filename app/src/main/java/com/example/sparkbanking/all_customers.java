package com.example.sparkbanking;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class all_customers extends AppCompatActivity {
     Button button;
     Button button1;
     Button button2;
     Button button3;
     Button button4;
     Button button5;
     Button button6;
     Button button7;
     Button button8;
     Button button9;
     TextView textView11;
     TextView textView12;
     TextView textView13;
     TextView textView14;
     TextView textView15;
     TextView textView16;
     TextView textView17;
     TextView textView18;
     TextView textView19;
     TextView textView20;
     String Name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_customers);
        button=(Button)findViewById(R.id.button2);
        button1=findViewById(R.id.button02);
        button2=findViewById(R.id.button03);
        button3=findViewById(R.id.button3);
        button4=findViewById(R.id.button5);
        button5=findViewById(R.id.button6);
        button6=findViewById(R.id.button7);
        button7=findViewById(R.id.button8);
        button8=findViewById(R.id.button9);
        button9=findViewById(R.id.button10);






        textView11=(TextView)findViewById(R.id.textView11);
        textView12=(TextView)findViewById(R.id.textView12);
        textView13=(TextView)findViewById(R.id.textView13);
        textView14=(TextView)findViewById(R.id.textView14);
        textView15=(TextView)findViewById(R.id.textView15);
        textView16=(TextView)findViewById(R.id.textView16);
        textView17=(TextView)findViewById(R.id.textView17);
        textView18=(TextView)findViewById(R.id.textView18);
        textView19=(TextView)findViewById(R.id.textView19);
        textView20=(TextView)findViewById(R.id.textView20);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Name = (String) textView11.getText();
                Intent intent = new Intent(all_customers.this,shubham_detail.class);
                intent.putExtra("Name",Name);
                startActivity(intent);

            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Name = (String) textView12.getText();
                Intent intent = new Intent(all_customers.this,shubham_detail.class);
                intent.putExtra("Name",Name);
                startActivity(intent);

            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Name = (String) textView13.getText();
                Intent intent = new Intent(all_customers.this,shubham_detail.class);
                intent.putExtra("Name",Name);
                startActivity(intent);

            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Name = (String) textView14.getText();
                Intent intent = new Intent(all_customers.this,shubham_detail.class);
                intent.putExtra("Name",Name);
                startActivity(intent);

            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Name = (String) textView15.getText();
                Intent intent = new Intent(all_customers.this,shubham_detail.class);
                intent.putExtra("Name",Name);
                startActivity(intent);

            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Name = (String) textView16.getText();
                Intent intent = new Intent(all_customers.this,shubham_detail.class);
                intent.putExtra("Name",Name);
                startActivity(intent);

            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Name = (String) textView17.getText();
                Intent intent = new Intent(all_customers.this,shubham_detail.class);
                intent.putExtra("Name",Name);
                startActivity(intent);

            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Name = (String) textView18.getText();
                Intent intent = new Intent(all_customers.this,shubham_detail.class);
                intent.putExtra("Name",Name);
                startActivity(intent);

            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Name = (String) textView19.getText();
                Intent intent = new Intent(all_customers.this,shubham_detail.class);
                intent.putExtra("Name",Name);
                startActivity(intent);

            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Name = (String) textView20.getText();
                Intent intent = new Intent(all_customers.this,shubham_detail.class);
                intent.putExtra("Name",Name);
                startActivity(intent);

            }
        });


    }

}