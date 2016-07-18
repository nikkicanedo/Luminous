package com.nikkay.canedo.luminous;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener{

    private ImageView imageView;
    private ToggleButton btnToggle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = (ImageView) findViewById(R.id.imgV);
        btnToggle = (ToggleButton) findViewById(R.id.btnToggle);

        btnToggle.setOnCheckedChangeListener(this);
    }

    @Override
    public void onCheckedChanged(CompoundButton compoundButton, boolean off) {
        if(off)
        {
            imageView.setImageResource(R.drawable.bulb2);
        }
        else
        {
            imageView.setImageResource(R.drawable.bulb1);
        }
    }
}
