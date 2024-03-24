package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.text.BreakIterator;

public class MainActivity extends AppCompatActivity {

    private EditText editText;
    private EditText editText2;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

        Button button1 = findViewById(R.id.button);
        Button button2 = findViewById(R.id.button2);
        Button button3 = findViewById(R.id.button3);
        Button button4 = findViewById(R.id.button4);
        editText = findViewById(R.id.editTextNumberPassword);
        editText2 = findViewById(R.id.editTextNumberPassword2);
        textView = findViewById(R.id.textView);




        }


    public void calculate(View view){

        int a, b, Addition;

        a = Integer.parseInt(editText.getText().toString());
        b = Integer.parseInt(editText2.getText().toString());
        Addition = a+b;

        textView.setText("The Addition Is " + Addition);


    }
}