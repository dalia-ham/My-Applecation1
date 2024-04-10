package com.example.myapplication1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private Button btnSend;
    private EditText edtMessage;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnSend = findViewById(R.id.btnSend);
        edtMessage = findViewById(R.id.edtMessage);
        btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // ToDo: setup intent and open second activity...
                String msg = edtMessage.getText().toString();
                if (msg.isEmpty()) {

                    return;


                }
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtra("DATA", msg);
                startActivity(intent);
            }
        });
    }
}