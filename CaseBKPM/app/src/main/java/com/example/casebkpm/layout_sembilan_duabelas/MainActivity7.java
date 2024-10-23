package com.example.casebkpm.layout_sembilan_duabelas;

import android.os.Bundle;
import android.widget.Button;
import android.widget.LinearLayout;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.casebkpm.R;

public class MainActivity7 extends AppCompatActivity {

    LinearLayout layout;
    Button button;
    public void loopButton() {
        for (int i = 1; i <= 20; i++) {
            // Membuat instance button baru setiap iterasi loop
            Button newButton = new Button(this);
            newButton.setText("Button " + i);

            // Menambahkan button baru ke dalam layout
            layout.addView(newButton);
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main7);

        layout = findViewById(R.id.linearLayout);
        button = findViewById(R.id.button5);

        loopButton();

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });


    }
}