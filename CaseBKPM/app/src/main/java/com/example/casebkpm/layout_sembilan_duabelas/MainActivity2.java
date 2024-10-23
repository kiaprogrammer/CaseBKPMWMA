package com.example.casebkpm.layout_sembilan_duabelas;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.casebkpm.R;

import java.util.Calendar;

public class MainActivity2 extends AppCompatActivity {

    DatePickerDialog datePicker;
    EditText editText;
    Button btnGetDate;
    TextView textView;



    View.OnClickListener onClickListenerText = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            final Calendar kalender = Calendar.getInstance();
            int day = kalender.get(Calendar.DAY_OF_MONTH);
            int month = kalender.get(Calendar.MONTH);
            int year = kalender.get(Calendar.YEAR);

            datePicker = new DatePickerDialog(MainActivity2.this, new DatePickerDialog.OnDateSetListener() {
                @Override
                public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                    editText.setText(dayOfMonth + "/" + month + "/" + year);
                }
            },
            year, month, day);
            datePicker.show();
        }
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main2);

        editText = findViewById(R.id.editText1);
        editText.setInputType(InputType.TYPE_NULL);
        editText.setOnClickListener(onClickListenerText);

        textView = findViewById(R.id.textView);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        btnGetDate = findViewById(R.id.button);
        btnGetDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText("Selected Date: " + editText.getText());
            }
        });
    }
}