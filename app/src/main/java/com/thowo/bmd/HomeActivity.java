package com.thowo.bmd;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.thowo.jmandroidframework.JMAnConst;
import com.thowo.jmandroidframework.JMAnFunctions;
import com.thowo.jmandroidframework.component.JMAnActivity;
import com.thowo.jmandroidframework.component.JMAnAsyncLoaderDefault;
import com.thowo.jmandroidframework.component.JMAnUIMessenger;
import com.thowo.jmandroidframework.component.JMAnVerticalButton;
import com.thowo.jmjavaframework.JMFunctions;

public class HomeActivity extends JMAnActivity {
    private JMAnVerticalButton btnMenuAset;
    private JMAnVerticalButton btnMenuPersediaan;
    private JMAnVerticalButton btnMenuFitur;
    private JMAnVerticalButton btnMenuScanQR;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        JMFunctions.trace("JIMIiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii");
        //JMAnFunctions.scanCode(this);



        this.initButtons();
    }

    private void initButtons(){
        this.btnMenuAset=findViewById(R.id.btnMenuAset);
        this.btnMenuPersediaan=findViewById(R.id.btnMenuPersediaan);
        this.btnMenuFitur=findViewById(R.id.btnMenuFitur);
        this.btnMenuScanQR=findViewById(R.id.btnMenuScanQR);

        this.btnMenuAset.setMyOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        JMAnFunctions.startNewActivity(HomeActivity.this,KIBMenuActivity.class);
                        //JMFunctions.setConnection(GitIgnoreDBConnection.mySQLConnection());
                        //JMFunctions.trace(JMFunctions.getCurrentConnection().queryMySQL("select * from tes",false).getString(1));
                    }
                }).start();
            }
        });
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data)
    {
        super.onActivityResult(requestCode, resultCode, data);
        // check if the request code is same as what is passed  here it is 2
        if(data==null)return;
        if(requestCode== JMAnConst.REQUESTCODE_SCANCODE)
        {
            String message=data.getStringExtra(JMAnConst.RESULTCODE_SCANCODE);
            JMFunctions.trace(message);
        }
    }
}