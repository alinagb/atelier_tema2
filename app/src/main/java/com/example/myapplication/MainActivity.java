package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText emailET;
    private EditText phoneET;
    private CheckBox termeniCB;
    private Button sumbitBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ch3);

        init();
    }

    private void init() {
        emailET = findViewById(R.id.emailET);
        phoneET = findViewById(R.id.phoneET);
        termeniCB = findViewById(R.id.termeniCB);
        sumbitBtn = findViewById(R.id.submitBtn);
    }

    public void getValuesOnClick(View view) {
        String email = emailET.getText().toString().trim();

        String emailPattern = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";

        if(emailET != null && email.matches(emailPattern) && !email.isEmpty()){
            if(termeniCB != null && termeniCB.isChecked()){
                Toast.makeText(this, "Sent", Toast.LENGTH_LONG).show();
            }else{
                termeniCB.setError(getString(R.string.termeni_check));
            }
        }else{
            emailET.setError(getString(R.string.valid_email));
        }
    }
}
