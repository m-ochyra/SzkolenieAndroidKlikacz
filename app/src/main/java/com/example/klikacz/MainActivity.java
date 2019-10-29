package com.example.klikacz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Date;

public class MainActivity extends AppCompatActivity {

    TextView tvValue;
    TextView tvDate;
    Button bAdd;

    int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvValue = findViewById(R.id.tvValue);
        tvDate = findViewById(R.id.tvDate);
        bAdd = findViewById(R.id.bAdd);

        tvValue.setText(String.valueOf(counter));

        Date date = new Date();
        tvDate.setText(date.toString());

        bAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter++;

                String text = tvValue.getText().toString();

                tvValue.setText(text + ", " + counter);

                Date date = new Date();
                tvDate.setText(date.toString());
            }
        });
    }
}
