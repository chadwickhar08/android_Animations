package com.chadmichaelh.animations;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    int count = 0;
    ImageView bart;

    public void fade(View view)
    {

            bart = (ImageView) findViewById(R.id.bart);
            bart.animate().scaleX(0.5f).scaleY(0.5f).rotation(360f).translationXBy(1000).translationYBy(1000).setDuration(2000);
            count = 1;

        //ImageView homer = (ImageView) findViewById(R.id.homer);
        //homer.animate().alpha(1f).setDuration(2000);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView bart = (ImageView) findViewById(R.id.bart);
        bart.setTranslationX(-1000);
        bart.setTranslationY(-1000);
    }
}
