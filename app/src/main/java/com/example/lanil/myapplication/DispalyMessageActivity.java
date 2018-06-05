package com.example.lanil.myapplication;

import android.content.Intent;
import android.content.SharedPreferences;
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

        // SP
        SharedPreferences sharedPreferences = getSharedPreferences("simple-store", MODE_PRIVATE);
        String value = sharedPreferences.getString("key", "default");

        // SP END

        textViewMessageView.setText("Intent: " + message + " SP: " + value);
    }

    /**
     * Start a basic Android service
     * @param view
     */
    public void initStartService(View view){
        Intent intent = new Intent(this, MyService.class);
        startService(intent);
    }

    /**
     * Send a signal to a simple Broadcast Receiver
     * @param view
     */
    public void sendMessage(View view){
        Intent intent = new Intent();
        intent.setAction("com.example.lanil.myapplication");
        sendBroadcast(intent);

    }

    /**
     *
     * @param view
     */
    public void openLayoutActivity(View view){
        Intent intent = new Intent(this, LayoutActivity.class);
        startActivity(intent);
    }
}
