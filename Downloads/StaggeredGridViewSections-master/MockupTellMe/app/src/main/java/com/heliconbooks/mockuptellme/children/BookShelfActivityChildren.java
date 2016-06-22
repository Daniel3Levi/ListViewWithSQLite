package com.heliconbooks.mockuptellme.children;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import com.heliconbooks.mockuptellme.MyViewHolder;
import com.heliconbooks.mockuptellme.R;

public class BookShelfActivityChildren extends Activity implements AdapterView.OnItemClickListener {

    GridView bookShelfGridView;
    BookChildrenAdapter bookChildrenAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_shelf_activity_children);
        bookChildrenAdapter = new BookChildrenAdapter(this);
        bookShelfGridView = (GridView)findViewById(R.id.book_shelf_children_gridView);
        bookShelfGridView.setAdapter(bookChildrenAdapter);
        bookShelfGridView.setOnItemClickListener(this);

    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

        Intent i = new Intent(BookShelfActivityChildren.this,BookInfoActivity.class);
         MyViewHolder holder = (MyViewHolder) view.getTag();

         Book tempBook = (Book) holder.bookCover.getTag();
        i.putExtra("bookImageCover",tempBook.getCoverImageId());
       i.putExtra("bookName",tempBook.getBookName());
          startActivity(i);
    }
}
