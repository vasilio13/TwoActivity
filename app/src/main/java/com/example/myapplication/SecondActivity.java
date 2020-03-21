package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    private static String EXTRA_NUMBER1 = "EXTRA+NUMBER1";
    private static String EXTRA_NUMBER2 = "EXTRA+NUMBER2";

    public static Intent newIntent(int number1, int number2) {
        Intent intent = new Intent(context, SecondActivity.class);
        intent.putExtra()
    }

    private Button buttonFinish;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);


        buttonFinish = findViewById(R.id.viewButtonGetResult);
        buttonFinish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }
}
