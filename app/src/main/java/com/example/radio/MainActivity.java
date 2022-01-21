package com.example.radio;

import android.os.Bundle;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {
    String x;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RadioGroup rg = findViewById(R.id.figures);
        Button clear = findViewById(R.id.buttonClear);
        Button output = findViewById(R.id.buttonChoose);

        output.setOnClickListener(view -> {
            TextView textView = findViewById(R.id.textView);
            textView.setText(x);
        });


        clear.setOnClickListener(v -> {
            rg.clearCheck();
            TextView textView = findViewById(R.id.textView);
            textView.setText("");
        });

        rg.setOnCheckedChangeListener((group, checkedId) -> {
            if (rg.getCheckedRadioButtonId() == -1)
            {
                // no radio buttons are checked
            }
            else
            {
                RadioButton radioButton = findViewById(checkedId);
                x = (String) radioButton.getText();
            }

        });
    }

}