package com.example.ex21;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
                    public void onClick(View v){
                openActivity2();
            }
        });
    }
    public  void openActivity2(){
        Intent intent =  new Intent(this, MainActivity2.class);
        startActivity(intent);
    }
}