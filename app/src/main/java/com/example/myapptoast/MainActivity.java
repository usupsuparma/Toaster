package com.example.myapptoast;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.toaster.Toaster;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toaster.toaster(this,"message test",1);
    }
}
