package com.heliconbooks.mockuptellme.adults;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import com.heliconbooks.mockuptellme.MyViewHolder;
import com.heliconbooks.mockuptellme.R;
import com.heliconbooks.mockuptellme.children.Book;
import com.heliconbooks.mockuptellme.children.BookChildrenAdapter;


public class BookShelfAdultsActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {


    GridView bookShelfGridViewAdults;
    BookChildrenAdapter bookAdultsAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_shelf_adults);
        bookAdultsAdapter = new BookChildrenAdapter(this);
        bookShelfGridViewAdults = (GridView)findViewById(R.id.book_shelf_adults_gridView);
        bookShelfGridViewAdults.setAdapter(bookAdultsAdapter);
        bookShelfGridViewAdults.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

        Intent i = new Intent(BookShelfAdultsActivity.this,BookEditorActivity.class);
        MyViewHolder holder = (MyViewHolder) view.getTag();

        Book tempBook = (Book) holder.bookCover.getTag();
        i.putExtra("bookImageCoverAdults",tempBook.getCoverImageId());
        i.putExtra("bookNameAdults",tempBook.getBookName());
        startActivity(i);

    }
}
