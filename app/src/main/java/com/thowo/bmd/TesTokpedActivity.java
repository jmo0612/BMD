package com.thowo.bmd;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.thowo.jmandroidframework.component.JMAnActivity;
import com.thowo.jmandroidframework.component.JMAnButtonCustomVertical;
import com.thowo.jmjavaframework.JMFunctions;

public class TesTokpedActivity extends JMAnActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tes_tokped);
        JMAnButtonCustomVertical btn=(JMAnButtonCustomVertical)findViewById(R.id.btnCustomTes);
        //btn.setEnabled(false);

        btn.setMyOnClickListener(new Runnable() {
            @Override
            public void run() {
                JMFunctions.trace("CLICKED");
            }
        });

        btn.setMyOnLongClickListener(new Runnable() {
            @Override
            public void run() {
                JMFunctions.trace("LONG CLICKED");
            }
        });
    }
}