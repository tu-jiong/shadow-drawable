package com.jm.shadowdrawable;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import com.jm.shadow_drawable.RoundRectDrawableWithShadow;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView imageView = findViewById(R.id.image);

        RoundRectDrawableWithShadow shadow = new RoundRectDrawableWithShadow(getResources(), null, 0, 20, 30);
        imageView.setBackgroundDrawable(shadow);
    }
}
