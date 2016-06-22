package com.heliconbooks.mockuptellme.children;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.heliconbooks.mockuptellme.R;

public class BookInfoActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {


    ListView mListView;
    TextView tvBookName;
    ImageView imgBookCover;
    RecordChildrenAdapter recordChildrenAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_info);


        recordChildrenAdapter = new RecordChildrenAdapter(this);
        mListView = (ListView)findViewById(R.id.records_listView);
        mListView.setAdapter(recordChildrenAdapter);
        mListView.setOnItemClickListener(this);

        Intent intent = getIntent();
        if (intent != null) {
            tvBookName = (TextView) findViewById(R.id.book_info_activity_tv_book_name);
            imgBookCover = (ImageView) findViewById(R.id.book_info_activity_book_cover_img);
            String bookName = intent.getStringExtra("bookName");
            int bookImageId = intent.getIntExtra("bookImageCover", R.drawable.the_little_prince);

            tvBookName.setText(bookName);
            imgBookCover.setImageResource(bookImageId);
        } else {


        }
    }


    public void closeActivity(View view) {

        finish();
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

  Intent i = new Intent(this,PlayingBookActivity.class);
        startActivity(i);

    }
}
