package com.thowo.bmd;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.thowo.jmandroidframework.JMAnFunctions;
import com.thowo.jmandroidframework.component.JMAnActivity;
import com.thowo.jmandroidframework.component.JMAnAsyncLoaderDefault;
import com.thowo.jmandroidframework.component.JMAnUIMessenger;
import com.thowo.jmjavaframework.JMFunctions;

public class MainActivity extends JMAnActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //jimi
        init();
    }
    private void init(){
        JMFunctions.setUIListener(new JMAnUIMessenger());
        JMFunctions.setAsyncListener(new JMAnAsyncLoaderDefault(this));
        //File languageExcelFile=JMAnFunctions.copyResourceToFileDir(R.raw.jmlanguagepack,"jmlanguagepack.xls",false);
        JMAnFunctions.init();
    }
}