package com.expensly.android;

import android.app.Activity;
import android.app.AlertDialog;
import android.view.LayoutInflater;

public class LoadingAlert {
    private final Activity activity;
    AlertDialog dialog;
    LoadingAlert(RegistrationActivity myActivity){
        activity = myActivity;
    }
    LoadingAlert(MainActivity myActivity){
        activity = myActivity;
    }

    void startAlertDialog(){
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);

        LayoutInflater inflater = activity.getLayoutInflater();
        builder.setView(inflater.inflate(R.layout.dialog_layout, null));

        builder.setCancelable(true);

        dialog = builder.create();
        dialog.show();
    }

    void closeAlertDialog(){
        dialog.dismiss();
    }
}
