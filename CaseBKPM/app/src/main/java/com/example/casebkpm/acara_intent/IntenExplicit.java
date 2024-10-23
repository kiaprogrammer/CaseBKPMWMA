package com.example.casebkpm.acara_intent;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import com.example.casebkpm.activity_tigabelas_enambelas.Main15;

import com.example.casebkpm.R;
import com.example.casebkpm.activity_tigabelas_enambelas.Main15;

public class IntenExplicit extends AppCompatActivity {

    Button button;
    Button button2;
    EditText nama;
    EditText npm;
    EditText noHP;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_inten_explicit);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        nama = findViewById(R.id.nama);
        npm = findViewById(R.id.npm);
        noHP = findViewById(R.id.noHp);


        button = findViewById(R.id.button6);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String dataNama = nama.getText().toString();
                String dataNpm = npm.getText().toString();
                String dataNohp = noHP.getText().toString();
                Intent intent = new Intent(IntenExplicit.this, Main15.class);

                intent.putExtra("nama", dataNama);
                intent.putExtra("npm", dataNpm);
                intent.putExtra("noHP", dataNohp);

                startActivity(intent);
            }
        });

    }
}