package com.hienqp.button;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    // Khai bao
    TextView txtNoiDung;
    Button btnClick;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Anh xa
        txtNoiDung = (TextView) findViewById(R.id.textViewNoiDung);
        btnClick = (Button) findViewById(R.id.buttonClick);

        // Viet code
        btnClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtNoiDung.setText("Lap trinh Ung dung Android");
            }
        });
    }
}