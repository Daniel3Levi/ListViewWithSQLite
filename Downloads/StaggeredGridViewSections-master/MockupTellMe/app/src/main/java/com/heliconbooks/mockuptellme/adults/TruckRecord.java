package com.heliconbooks.mockuptellme.adults;

/**
 * Created by Daniel on 22/06/16.
 */
public class TruckRecord {

    private int pageNumber;
    private int recordNumber;

    public TruckRecord(int pageNumber, int recordNumber) {
        this.pageNumber = pageNumber;
        this.recordNumber = recordNumber;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    public int getRecordNumber() {
        return recordNumber;
    }

    public void setRecordNumber(int recordNumber) {
        this.recordNumber = recordNumber;
    }
}
