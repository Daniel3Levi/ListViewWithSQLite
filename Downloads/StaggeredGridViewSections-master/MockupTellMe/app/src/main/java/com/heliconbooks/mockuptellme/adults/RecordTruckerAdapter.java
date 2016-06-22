package com.heliconbooks.mockuptellme.adults;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.heliconbooks.mockuptellme.R;

import java.util.ArrayList;

/**
 * Created by Daniel on 22/06/16.
 */
public class RecordTruckerAdapter extends BaseAdapter {

    Context context;
    ArrayList<TruckRecord> truckRecords;


    public RecordTruckerAdapter(Context context) {
        this.context = context;
        truckRecords = new ArrayList<TruckRecord>();
        int[] pageNumber = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
        int[] recordNumber = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};

        for (int i = 0; i < 13; i++) {
            TruckRecord temp = new TruckRecord(pageNumber[i], recordNumber[i]);
            truckRecords.add(temp);

        }

    }

    @Override
    public int getCount() {
        return truckRecords.size();
    }

    @Override
    public Object getItem(int position) {
        return truckRecords.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View row = convertView;
        RecordTruckerViewHolder viewHolder = null;
        if (row == null){
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            row =   inflater.inflate(R.layout.recored_row_view_activity_recordin,parent,false);
            viewHolder = new RecordTruckerViewHolder(row);
            row.setTag(viewHolder);
        }else {

            viewHolder = (RecordTruckerViewHolder)row.getTag();
        }
        TruckRecord temp = truckRecords.get(position);
        viewHolder.page.setText(String.valueOf(temp.getPageNumber()));
        viewHolder.record.setText(String.valueOf(temp.getRecordNumber()));
        viewHolder.page.setTag(temp);
        viewHolder.record.setTag(temp);
        return row;
    }
}

class RecordTruckerViewHolder {

    TextView page, record;

    public RecordTruckerViewHolder(View view) {

        record = (TextView) view.findViewById(R.id.record_trucker_row_tv_record);
        page = (TextView) view.findViewById(R.id.record_trucker_row_tv_page);
    }
}