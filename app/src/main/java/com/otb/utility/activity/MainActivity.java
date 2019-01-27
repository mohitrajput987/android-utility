package com.otb.utility.activity;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.otb.preference.SharedPreferenceUtils;
import com.otb.utility.R;

public class MainActivity extends AppCompatActivity {
    private final static String TAG = MainActivity.class.getSimpleName();
    private Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        context = MainActivity.this;
        init();
    }

    private void init() {
        SharedPreferenceUtils.getInstance(context).saveBoolean("is_logged_in", true);
        boolean isLoggedIn = SharedPreferenceUtils.getInstance(context).getBoolean("is_logged_in");
        Log.d(TAG, "init(): isLoggedIn=" + isLoggedIn);
        SharedPreferenceUtils.getInstance(context).clear();
    }
}
