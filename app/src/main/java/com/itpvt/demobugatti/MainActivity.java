package com.itpvt.demobugatti;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.vicky.completerotation.RotateAnimationClass;

public class MainActivity extends AppCompatActivity {
    private Button play_button;
    private RotateAnimationClass anim;
    private ImageView imageview;
    private int[] blue_car_array = { R.drawable.blue1, R.drawable.blue2,
            R.drawable.blue3, R.drawable.blue4, R.drawable.blue5,
            R.drawable.blue6, R.drawable.blue7, R.drawable.blue8,
            R.drawable.blue9, R.drawable.blue10, R.drawable.blue11,
            R.drawable.blue12, R.drawable.blue13, R.drawable.blue14,
            R.drawable.blue15, R.drawable.blue16, R.drawable.blue17,
            R.drawable.blue18, R.drawable.blue19, R.drawable.blue20,
            R.drawable.blue21, R.drawable.blue22, R.drawable.blue23,
            R.drawable.blue24, R.drawable.blue25, R.drawable.blue26,
            R.drawable.blue27, R.drawable.blue28, R.drawable.blue29,
            R.drawable.blue30, R.drawable.blue31, R.drawable.blue32,
            R.drawable.blue33, R.drawable.blue34, R.drawable.blue35, };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        play_button = (Button) findViewById(R.id.play_button);

        // pass the array of images in constructor
        anim = new RotateAnimationClass(blue_car_array,
                (ImageView) findViewById(R.id.imageView));
        // if swipe distance is too small then it will be too sensitive, by
        // default
        // it will be 60 pixcel
        anim.SetMinSwipeDistance(10);
        // by default it is 1
        anim.SkipImages(1);
        // checks if auto play running
        // if(anim.isAutoPlayRunning())
        // stops autoplay
        // anim.StopThrread();
        play_button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                // since button is ude to play and to stop animation

                anim.AutoPlay();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }


}
