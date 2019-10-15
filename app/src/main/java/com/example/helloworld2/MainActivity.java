package com.example.helloworld2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private String TAG = "*** MainActivity: TAG is not set ***";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d("********************", getClass().getSimpleName() + " start ﹕********************");
        String methodName = new Object(){}.getClass().getEnclosingMethod().getName();
        Log.d(TAG, methodName);
        super.onCreate(savedInstanceState);
    }

    @Override
    protected void onStart() {
        String methodName = new Object(){}.getClass().getEnclosingMethod().getName();
        Log.d(TAG, methodName);
        super.onStart();
    }

    @Override
    protected void onResume() {
        String methodName = new Object(){}.getClass().getEnclosingMethod().getName();
        Log.d(TAG, methodName);
        super.onResume();
    }

    @Override
    protected void onRestart() {
        String methodName = new Object(){}.getClass().getEnclosingMethod().getName();
        Log.d(TAG, methodName);
        super.onRestart();
    }

    @Override
    protected void onPause() {
        String methodName = new Object(){}.getClass().getEnclosingMethod().getName();
        Log.d(TAG, methodName);
        super.onPause();
    }

    @Override
    protected void onStop() {
        String methodName = new Object(){}.getClass().getEnclosingMethod().getName();
        Log.d(TAG, methodName);
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        String methodName = new Object(){}.getClass().getEnclosingMethod().getName();
        Log.d(TAG, methodName);
        super.onDestroy();
    }
}
