package com.example.administrator.myproject;

import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by Administrator on 2017/10/19.
 */

public class FirstActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        ActionBar actionbar = getSupportActionBar();
        if(actionbar != null) {
            actionbar.hide();
        }
    }
}
