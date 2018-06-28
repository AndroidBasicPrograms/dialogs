package com.example.jayhind.lecture_app.Dialogs;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.example.jayhind.lecture_app.R;

import static com.example.jayhind.lecture_app.R.*;

public class ToastActivity extends AppCompatActivity {
    Context context;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout.activity_dialogs);
        context=this;
        //Toast.makeText(context, "hello", Toast.LENGTH_SHORT).show();
        /*Custom toast*/
        LayoutInflater inflater = getLayoutInflater();
        View layout = inflater.inflate(R.layout.activity_dialogs, null);
        Toast t=new Toast(context);
        //t.setText("custom toast");
        t.setView(layout);
        t.show();
    }
}
