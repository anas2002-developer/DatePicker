package com.anas.datepicker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.DatePicker;
import android.widget.TextView;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    DatePicker datePicker;
    TextView txtDateHere;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        datePicker=findViewById(R.id.datePicker);
        txtDateHere=findViewById(R.id.txtDateHere);

        Calendar calendar = Calendar.getInstance();

        datePicker.init(
                calendar.get(Calendar.YEAR),
                calendar.get(Calendar.MONTH),
                calendar.get(Calendar.DAY_OF_MONTH),
                new DatePicker.OnDateChangedListener() {
                    @Override
                    public void onDateChanged(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
                        txtDateHere.setText(dayOfMonth+" "+(monthOfYear+1)+" "+year);
                    }
                }
        );
    }
}