package com.thowo.bmd;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.thowo.jmandroidframework.JMAnFunctions;
import com.thowo.jmandroidframework.component.JMAnActivity;
import com.thowo.jmandroidframework.component.JMAnAsyncLoaderDefault;
import com.thowo.jmandroidframework.component.JMAnUIMessenger;
import com.thowo.jmjavaframework.JMFunctions;

public class TestActivity extends JMAnActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
    }
}