package com.heliconbooks.mockuptellme.adults;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.heliconbooks.mockuptellme.R;

public class BookEditorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_editor);




    }


    public void closeBookEditorActivity(View view) {

        finish();
    }
}
