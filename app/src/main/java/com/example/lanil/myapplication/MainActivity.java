package com.example.lanil.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // Initializing UI elements
    TextView textView;
    Button button;
    EditText editTextMessage;

    private static final String TAG = "lifecycle_watch";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView);
        button = findViewById(R.id.button);
        editTextMessage = findViewById(R.id.editTextMessage);

        Log.i(TAG, "onCreate");
    }

    // This function is accesible from View
    public void onButtonClick(View view){
        textView.setText(R.string.btn_msg);
    }

    public void sendMessage(View view){
        Intent intent = new Intent(this, DispalyMessageActivity.class);

        String message = editTextMessage.getText().toString();
        intent.putExtra("EXTRA_MESSAGE", message);

        startActivity(intent);
    }
}
