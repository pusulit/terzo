package it.sii.android.animationdrawabletest;

import android.app.Activity;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.widget.Button;

public class AnimationDrawableTestActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        /*
        Button animatedButton = (Button)findViewById(R.id.animatedButton);
        AnimationDrawable animDrawable  = (AnimationDrawable)animatedButton.getBackground();
        animDrawable .start();
        */
    }
    @Override
    public void onWindowFocusChanged(boolean hasFocus) {
        Button animatedButton = (Button)findViewById(R.id.animatedButton);
        AnimationDrawable animDrawable  = (AnimationDrawable)animatedButton.getBackground();
        if (hasFocus) {
        	animDrawable .start();
        } else {
        	animDrawable .stop();
        }
    }
    
}