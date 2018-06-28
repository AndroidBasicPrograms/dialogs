package com.example.jayhind.lecture_app.Dialogs;

import android.app.AlertDialog;
import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TimePicker;

import com.example.jayhind.lecture_app.R;

import java.util.Calendar;
import java.util.Date;

public class DatePicker_and_Time_picker_DialogActivity extends AppCompatActivity implements View.OnClickListener {
    ImageButton ibtn;
    EditText etdate;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_date_picker_dialog);
        ibtn=findViewById(R.id.btndate);
        etdate=findViewById(R.id.textdate);
        ibtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
    //setDate();
        setTime();
    }

    private void setTime() {
        Calendar c=Calendar.getInstance();
        int m=c.get(c.MINUTE);
        int h=c.get(c.HOUR);
        final int[] s = {c.get(c.SECOND)};
         new TimePickerDialog(this,  AlertDialog.THEME_HOLO_LIGHT ,new TimePickerDialog.OnTimeSetListener() {
            @Override
            public void onTimeSet(TimePicker timePicker, int h1, int m1) {
                String st="AM";
                int hour_of_12_hour_format = 0;
                if(h1 > 11)
                {
                    hour_of_12_hour_format = h1 - 12;
                  st = "PM";
                }
                else {
                    hour_of_12_hour_format = h1;
                }
                etdate.setText(hour_of_12_hour_format+":"+m1+ st);
            }
        },h,m,false).show();
    }

    public void setDate()
    {
        Calendar c=Calendar.getInstance();
        int d=c.get(c.DAY_OF_MONTH);
        int m=c.get(c.MONTH);
        int y=c.get(c.YEAR);
        new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker datePicker, int y, int m, int d) {
                etdate.setText(d+"/"+m+"/"+d);
            }
        },y,m,d).show();
    }

}
