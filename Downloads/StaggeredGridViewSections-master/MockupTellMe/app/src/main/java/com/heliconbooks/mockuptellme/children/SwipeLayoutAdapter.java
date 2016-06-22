package com.heliconbooks.mockuptellme.children;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.heliconbooks.mockuptellme.R;

/**
 * Created by Daniel on 22/06/16.
 */
public class SwipeLayoutAdapter extends PagerAdapter {

    private Context context;
    private LayoutInflater inflater;

    private int[] bookPages = {
            R.drawable.a_0,
            R.drawable.a_1,
            R.drawable.a_2,
            R.drawable.a_3,
            R.drawable.a_4,
            R.drawable.a_5,
            R.drawable.a_6,
            R.drawable.a_7,
            R.drawable.a_8,
            R.drawable.a_9,
            R.drawable.a_10,
            R.drawable.a_11,
            R.drawable.a_12,
            R.drawable.a_13
    };

    public SwipeLayoutAdapter(Context context) {
        this.context = context;
    }

    @Override
    public int getCount() {
        return bookPages.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return (view == (LinearLayout)object);
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {

        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
       View page =  inflater.inflate(R.layout.swipe_layout,container,false);
        ImageView imageView = (ImageView) page.findViewById(R.id.swipe_layout_img);
        TextView textView = (TextView) page.findViewById(R.id.swipe_layout_tv);
        imageView.setImageResource(bookPages[position]);
        textView.setText(position+1 + " / " + bookPages.length+1);
        container.addView(page);

        return page;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {

        container.removeView((LinearLayout)object);

    }
}
