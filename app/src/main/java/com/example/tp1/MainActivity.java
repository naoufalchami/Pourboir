package com.example.tp1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Switch;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    EditText editText;
    RadioButton radioButton1, radioButton2, radioButton3;
    Switch aswitch;
    Button button;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        editText = findViewById(R.id.ed1);
        radioButton1 = findViewById(R.id.rd1);
        radioButton2 = findViewById(R.id.rd2);
        radioButton3 = findViewById(R.id.rd3);
        aswitch = findViewById(R.id.sw);
        button = findViewById(R.id.button);
        textView = findViewById(R.id.pourboir);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String amountStr = editText.getText().toString();


                float amount = Float.parseFloat(amountStr);


                float p;
                if (radioButton1.isChecked()) {
                    p = amount * 0.20f;
                } else if (radioButton2.isChecked()) {
                    p = amount * 0.15f;
                } else {
                    p = amount * 0.10f;
                }


                textView.setText(String.valueOf(p));
            }
        });
    }
}
