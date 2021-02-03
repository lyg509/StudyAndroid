package com.example.studyandroid;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "LogTest";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void mOnClick(View v) {
        switch (v.getId()) {
            case R.id.btnAssert:
                Log.wtf(TAG, "Assert Message");
                break;

            case R.id.btnError:
                Log.wtf(TAG, "Error Message");
                break;
            case R.id.btnWarn:
                Log.wtf(TAG, "Warn Message");
                break;
            case R.id.btnInfo:
                Log.wtf(TAG, "Info Message");
                break;
            case R.id.btnDebug:
                Log.wtf(TAG, "Debug Message");
                break;
            case R.id.btnVerbose:
                Log.wtf(TAG, "Verbose Message");
                break;

        }
    }



}