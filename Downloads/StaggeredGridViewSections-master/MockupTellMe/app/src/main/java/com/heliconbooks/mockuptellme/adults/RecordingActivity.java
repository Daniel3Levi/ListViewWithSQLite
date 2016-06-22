package com.heliconbooks.mockuptellme.adults;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ListView;

import com.heliconbooks.mockuptellme.R;
import com.heliconbooks.mockuptellme.children.SwipeLayoutAdapter;
import com.heliconbooks.mockuptellme.custom.PlayPauseDrawable;

public class RecordingActivity extends AppCompatActivity {

    ViewPager viewPagerRecording;
    SwipeLayoutAdapter swipeLayoutAdapter;
    RecordTruckerAdapter recordTruckerAdapter;
    ImageView imgViewPlayOriginalVoice;
    ImageButton btnStartRecord;
    ListView lvRecordsTrucker;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recording);

        imgViewPlayOriginalVoice =  (ImageView)findViewById(R.id.activity_recording_img_play_original_voice);
        final PlayPauseDrawable mPlayPauseDrawable = new PlayPauseDrawable(60, 0XFFE91E63, 0XFFffffff,300);
        btnStartRecord = (ImageButton) findViewById(R.id.recording_activity_btn_start_record);
        imgViewPlayOriginalVoice.setImageDrawable(mPlayPauseDrawable);
        swipeLayoutAdapter = new SwipeLayoutAdapter(this);
        viewPagerRecording = (ViewPager)findViewById(R.id.activity_recording_view_pager);
        viewPagerRecording.setAdapter(swipeLayoutAdapter);
        recordTruckerAdapter = new RecordTruckerAdapter(this);
        lvRecordsTrucker = (ListView) findViewById(R.id.activity_recording_list_view_record_trucker);
        lvRecordsTrucker.setAdapter(recordTruckerAdapter);



        btnStartRecord.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



            }
        });


        imgViewPlayOriginalVoice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mPlayPauseDrawable.toggle();
            }
        });



    }

}
