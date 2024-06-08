package com.example.segundoapp;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    TextView title;
    EditText counter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        title = findViewById(R.id.title);
        title.setText("Ana Flavia");
        counter = findViewById(R.id.counter);
        counter.setText("0");
    }

    public void toastButtonOnClick(View v) {
        Toast.makeText(
                MainActivity.this,
                "button pressed",
                Toast.LENGTH_LONG
        ).show();
    }

    public void addButton(View v) {
       String aux = counter.getText().toString();
       int num = Integer.parseInt(aux);
       num++;
       counter.setText(String.valueOf(num));
    }
}