package com.example.administrator.work1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("MyActivity","onStart方法开始了");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("MyActivity","onResume要出现了");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("MyActivity","onPause方法被挡着了");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("MyActivity","onStopt方法被停止");
    }

}
