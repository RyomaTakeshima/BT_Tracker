package com.example.task10;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class LogActivity extends AppCompatActivity {

    EditText userInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log);
        userInput = (EditText)findViewById(R.id.LogInputData);
    }

    public void confirmBT(View view) {
        Intent toConfirm = new Intent(this, ConfirmActivity.class);
        toConfirm.putExtra("BT_data", userInput.getText().toString());
        startActivity(toConfirm);
    }
}
