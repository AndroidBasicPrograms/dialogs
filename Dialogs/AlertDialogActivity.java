package com.example.jayhind.lecture_app.Dialogs;

import android.content.Context;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.example.jayhind.lecture_app.R;

public class AlertDialogActivity extends AppCompatActivity {

    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alert_dialog);
        context=this;
        new AlertDialog.Builder(context).setTitle("abc").setMessage("hello").setPositiveButton("Ok", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(context, "Ok pressed", Toast.LENGTH_SHORT).show();
            }
        }).create().show();
    }
}
