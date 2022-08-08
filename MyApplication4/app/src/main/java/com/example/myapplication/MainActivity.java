package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView x = findViewById(R.id.textview1);
        TextView y = findViewById(R.id.textview2);
        EditText z = findViewById(R.id.edittext1);
        EditText a = findViewById(R.id.edittext2);
        Button d = findViewById(R.id.button);


        d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int n1 = Integer.parseInt(z.getText().toString());
                int n2 = Integer.parseInt(a.getText().toString());
                int result = n1+n2 ;
                y.setText(String.valueOf(result));
            }
        });
    }
}