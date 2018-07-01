package com.example.android.journalc.firebase;

import android.app.Application;

import com.google.firebase.database.FirebaseDatabase;

public class Firebase extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        /* Enable disk persistence  */
        FirebaseDatabase.getInstance().setPersistenceEnabled(true);
    }
}
