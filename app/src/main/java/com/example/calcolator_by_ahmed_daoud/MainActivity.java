package com.example.calcolator_by_ahmed_daoud;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView txtv = findViewById(R.id.txtv);
        final EditText ed1 = findViewById(R.id.ed1);
        final EditText ed2 = findViewById(R.id.ed2);
        Button btnadd = findViewById(R.id.btnadd);
        Button btnsub = findViewById(R.id.btnsub);
        Button btnmult = findViewById(R.id.btnmult);
        Button btndiv = findViewById(R.id.btndiv);

        btnadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {

                    double num1 = Integer.parseInt(ed1.getText().toString());
                    double num2 = Integer.parseInt(ed2.getText().toString());
                    double result = num1 + num2;
                    txtv.setText(String.valueOf(result));
                }catch (Exception ex)
            {
                Toast.makeText(MainActivity.this, "Error"+ex.getMessage(), Toast.LENGTH_SHORT).show();
            }
            }
        });
        btnsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {

                    double num1 = Integer.parseInt(ed1.getText().toString());
                    double num2 = Integer.parseInt(ed2.getText().toString());
                    double result = num1 - num2;
                    txtv.setText(String.valueOf(result));
                }catch (Exception ex)
                {
                    Toast.makeText(MainActivity.this, "Error"+ex.getMessage(), Toast.LENGTH_SHORT).show();
                }
            }
        });
        btnmult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {

                    double num1 = Integer.parseInt(ed1.getText().toString());
                    double num2 = Integer.parseInt(ed2.getText().toString());
                    double result = num1 * num2;
                    txtv.setText(String.valueOf(result));
                }catch (Exception ex)
                {
                    Toast.makeText(MainActivity.this, "Error"+ex.getMessage(), Toast.LENGTH_SHORT).show();
                }
            }
        });
        btndiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {

                    double num1 = Integer.parseInt(ed1.getText().toString());
                    double num2 = Integer.parseInt(ed2.getText().toString());
                    double result = num1 / num2;
                    txtv.setText(String.valueOf(result));
                }catch (Exception ex)
                {
                    Toast.makeText(MainActivity.this, "Error"+ex.getMessage(), Toast.LENGTH_SHORT).show();
                }
            }
        });



    }
}