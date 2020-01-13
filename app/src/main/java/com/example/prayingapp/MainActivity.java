package com.example.prayingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button addCountButton;
    private Button resetButton;
    private TextView countNumber;

    private int currentCountNumber;

    private View.OnClickListener clickListener= new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            switch (view.getId()) {
                case R.id.addCountButton :
                    addCounter();
                    break;
                case R.id.resetButton :
                    initCounter();
                    break;
            }
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addCountButton = findViewById(R.id.addCountButton);
        addCountButton.setOnClickListener(clickListener);
        resetButton = findViewById(R.id.resetButton);
        resetButton.setOnClickListener(clickListener);

        countNumber = findViewById(R.id.countNumber);

        initCounter();
    }

    private void initCounter() {
        currentCountNumber = 0;
        countNumber.setText(String.valueOf(currentCountNumber));
    }

    private void addCounter() {
        currentCountNumber++;
        countNumber.setText(String.valueOf(currentCountNumber));
    }
}
