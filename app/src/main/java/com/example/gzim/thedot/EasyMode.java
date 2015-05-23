package com.example.gzim.thedot;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

import static com.example.gzim.thedot.R.drawable.*;


public class EasyMode extends ActionBarActivity {

    Button buttonTheDot;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_easy_mode);

        
        buttonTheDot = new Button(this);
        buttonTheDot.setBackground(reddot);

        buttonTheDot.setWidth(30);
        buttonTheDot.setHeight(30);

    }


}
