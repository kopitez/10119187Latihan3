package com.example.monitory;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class HaiActivity extends AppCompatActivity {

    private TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hai);

        String nama = getIntent().getExtras().getString("nama");

        result = findViewById(R.id.txtDoneTitle);
        result.setText("Beres! sekarang "+nama+"\nudah bisa ngecek penggunaan hp mu tiap hari buat bantu\t "+nama+"\t ngatur waktu :)");
    }






}
