package com.heliconbooks.mockuptellme.children;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

import com.heliconbooks.mockuptellme.R;
import com.heliconbooks.mockuptellme.custom.PlayPauseDrawable;

public class PlayingBookActivity extends AppCompatActivity {

    ViewPager viewPager;
    SwipeLayoutAdapter swipeLayoutAdapter;
    ImageView btnPlayStory;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playing_book);

        viewPager = (ViewPager) findViewById(R.id.playing_activity_view_pager);
        swipeLayoutAdapter = new SwipeLayoutAdapter(this);
        viewPager.setAdapter(swipeLayoutAdapter);

        btnPlayStory = (ImageView) findViewById(R.id.activity_playing_play_btn);
        final PlayPauseDrawable mPlayPauseDrawable = new PlayPauseDrawable(60, 0XFFE91E63, 0XFFffffff,300);
        btnPlayStory.setImageDrawable(mPlayPauseDrawable);
        btnPlayStory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mPlayPauseDrawable.toggle();
            }
        });

    }
}
