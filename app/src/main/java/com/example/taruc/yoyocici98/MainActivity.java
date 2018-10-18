package com.example.taruc.yoyocici98;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView textViewMsg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //onCreate()=main() function
        super.onCreate(savedInstanceState); //call super class,inherit there
        //display UI
        //R=resource class
        //layout=is a folder
        setContentView(R.layout.activity_main);

        TextView textViewMsg; //TextView= a class
                              //textViewMsg= instance
        //Link UI to program
        textViewMsg=findViewById(R.id.textViewMessage);


    }
    public void showMessage(View view){
        textViewMsg.setText("Hello,<your name here>");

    }
}
