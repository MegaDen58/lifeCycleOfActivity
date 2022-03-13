package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private String data = "5";
    public static final String TAG = "StartActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate");
        Toast.makeText(this, "onCreate()", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onStart()
    {
        super.onStart();
        Log.d(TAG, "onStart");
        Toast.makeText(this, "onStart()", Toast.LENGTH_LONG).show();
        resetUI();
    }

    @Override
    protected void onResume()
    {
        super.onResume();
        Log.d(TAG, "onResume");
        Toast.makeText(this, "onResume()", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onPause()
    {
        super.onPause();
        Log.d(TAG, "onPause");
        Toast.makeText(this, "onPause()", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onStop()
    {
        super.onStop();
        Log.d(TAG, "onStop");
        Toast.makeText(this, "onStop()", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onRestart()
    {
        super.onRestart();
        Log.d(TAG, "onRestart");
        Toast.makeText(this, "onRestart()", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onDestroy()
    {
        super.onDestroy();
        Log.d(TAG, "onDestroy");
        Toast.makeText(this, "onDestroy()", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onSaveInstanceState(Bundle outState)
    {
        super.onSaveInstanceState(outState);
        outState.putString("5", data);
        Log.d(TAG, "onSaveInstanceState");
        Toast.makeText(this, "onSaveInstanceState()", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState)
    {
        super.onRestoreInstanceState(savedInstanceState);
        if (savedInstanceState != null && savedInstanceState.containsKey("5"))
        {
            data = savedInstanceState.getString("5");
        }
        Log.d(TAG, "onRestoreInstanceState");
        Toast.makeText(this, "onRestoreInstanceState()", Toast.LENGTH_LONG).show();
    }

    private void resetUI()
    {
        ((TextView) findViewById(R.id.balance)).setText(data.toString());
        Log.d(TAG, "resetUI");
        Toast.makeText(this, "resetUI()", Toast.LENGTH_LONG).show();
    }
}