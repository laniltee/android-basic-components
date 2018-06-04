package com.example.lanil.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class DispalyMessageActivity extends AppCompatActivity {

    TextView textViewMessageView;
    Button buttonService;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dispaly_message);

        textViewMessageView = findViewById(R.id.textViewMessageView);
        buttonService = findViewById(R.id.buttonService);

        Intent intent = getIntent();
        String message = intent.getStringExtra("EXTRA_MESSAGE");

        textViewMessageView.setText(message);
    }

    public void initStartService(View view){
        Intent intent = new Intent(this, MyService.class);
        startService(intent);
    }
}
