package com.example.gzim.thedot;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.Timer;
import java.util.TimerTask;


/**
 * Created by Gezim on 02.05.2015.
 */
public class FirstScreen extends Activity {
    Timer t;
    TextView tv;
    Thread thread;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_screen);
        LinearLayout l = (LinearLayout) findViewById(R.id.ScreenLayout);
        tv = (TextView) findViewById(R.id.tvMessage);
        l.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                Intent i=new Intent(FirstScreen.this,ChooseMode.class);
                startActivity(i);
                finish();
                return false;
            }
        });
        Thread t = new Thread() {

            @Override
            public void run() {
                try {
                    while (!isInterrupted()) {
                        Thread.sleep(500);
                        runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                               if (tv.getText().toString().equals(""))
                               {
                                   tv.setText("Tap to continue");
                               }
                                else
                               {
                                   tv.setText("");
                               }
                            }
                        });
                    }
                } catch
                        (InterruptedException e) {
                }
            }
        };

        t.start();
    }
}
