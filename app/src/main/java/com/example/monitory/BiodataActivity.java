package com.example.monitory;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.view.View.OnClickListener;
import androidx.appcompat.app.AppCompatActivity;

public class BiodataActivity extends AppCompatActivity {
    EditText nama;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_biodata);

        nama = findViewById(R.id.edtBiodataName);

        Button button_next = findViewById(R.id.button_next);

        button_next.setOnClickListener(v -> {

            Intent i = new Intent(BiodataActivity.this, HaiActivity.class);
            i.putExtra("nama", nama.getText().toString());
            startActivity(i);
        });

    }
}