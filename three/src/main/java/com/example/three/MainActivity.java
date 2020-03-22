package com.example.three;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText viewNumber1Text;
    private EditText viewNumber2Text;
    private TextView viewResultText;
    private Button viewButtonCalculate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewNumber1Text = findViewById(R.id.viewNumber1Text);
        viewNumber2Text = findViewById(R.id.viewNumber2Text);
        viewResultText = findViewById(R.id.viewResultText);

        viewButtonCalculate = findViewById(R.id.viewButtonCalculate);
        viewButtonCalculate.setOnClickListener(new View.OnClickListener()){

                    public void onClick(View v) {
                int number1 = Integer.parseInt(viewNumber1Text.getText().toString());
                int number2 = Integer.parseInt(viewNumber2Text.getText().toString());

                        int result = number1 * number2;
                        viewResultText.setText(String.valueOf(result));
            }
        }

    }
}
