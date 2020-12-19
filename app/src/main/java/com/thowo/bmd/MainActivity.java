package com.thowo.bmd;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.thowo.jmandroidframework.JMAnConst;
import com.thowo.jmandroidframework.JMAnFunctions;
import com.thowo.jmandroidframework.component.JMAnActivity;
import com.thowo.jmandroidframework.component.JMAnAsyncLoaderDefault;
import com.thowo.jmandroidframework.component.JMAnUIMessenger;
import com.thowo.jmandroidframework.component.JMAnVerticalButton;
import com.thowo.jmjavaframework.JMDate;
import com.thowo.jmjavaframework.JMFunctions;
import com.thowo.jmjavaframework.db.JMConnection;

import java.io.IOException;
import java.security.GeneralSecurityException;

public class MainActivity extends JMAnActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        //JMAnFunctions.startNewActivity(this,ListInventarisActivity.class);
        JMAnFunctions.startNewActivity(this,ListPengadaanActivity.class);
        this.finish();
    }
    private void init(){
        JMFunctions.setUIListener(new JMAnUIMessenger());
        JMFunctions.setAsyncListener(new JMAnAsyncLoaderDefault(this));
        //File languageExcelFile=JMAnFunctions.copyResourceToFileDir(R.raw.jmlanguagepack,"jmlanguagepack.xls",false);

        JMAnFunctions.init(Global.localeCode);
        JMDate now=JMDate.now();
        Global.setCurrentDate(now);
        Global.setCurrentYear(now.getYearFull());
        JMFunctions.setConnection(GitIgnoreDBConnection.mySQLConnection());
    }

}