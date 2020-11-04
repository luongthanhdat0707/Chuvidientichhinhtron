package com.example.hinhtron;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText edtr;
    Button btntinh, btnlamlai;
    TextView txtcv, txtdt;
    double Pi = 3.14;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtr = findViewById(R.id.edtr);
        btntinh = findViewById(R.id.btntinh);
        btnlamlai = findViewById(R.id.btnlamlai);
        txtcv = findViewById(R.id.kqcv);
        txtdt = findViewById(R.id.kqdt);

        tinh();
        lamlai();
    }

    private void lamlai() {
        btnlamlai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edtr.requestFocus();
                edtr.setText("");
                txtcv.setText("");
                txtdt.setText("");
            }
        });
    }

    private void tinh() {
        btntinh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double r = Double.parseDouble(edtr.getText() + "");
                double cv = (2 * r * Pi);
                double dt = (r * r * Pi);
                txtcv.setText(txtcv.getText().toString() + cv);
                txtdt.setText(txtdt.getText().toString() + dt);
            }
        });
    }
}
