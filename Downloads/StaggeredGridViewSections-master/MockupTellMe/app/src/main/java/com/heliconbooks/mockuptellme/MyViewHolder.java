package com.heliconbooks.mockuptellme;

import android.view.View;
import android.widget.ImageView;

/**
 * Created by Daniel on 22/06/16.
 */
public class MyViewHolder {

    public ImageView bookCover;

    public MyViewHolder(View view) {

        bookCover = (ImageView) view.findViewById(R.id.book_cover_imageView);
    }
}
