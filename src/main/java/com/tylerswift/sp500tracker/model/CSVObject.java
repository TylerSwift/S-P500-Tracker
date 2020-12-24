package com.tylerswift.sp500tracker.model;

import java.util.List;

public class CSVObject {

    List<String> headers;
    List<List<String>> data;

    public CSVObject(List<String> headers, List<List<String>> data) {
        this.headers = headers;
        this.data = data;
    }

    public List<String> getHeaders() {
        return headers;
    }

    public void setHeaders(List<String> headers) {
        this.headers = headers;
    }

    public List<List<String>> getData() {
        return data;
    }

    public void setData(List<List<String>> data) {
        this.data = data;
    }

    public void describe() {
        System.out.println("Headers = " + headers);
        System.out.println("Data:");
        for (int i = 0; i < data.size(); i++) {
            System.out.println((i + 1) + ":" + data.get(i));
        }

        System.out.println("Number of rows = [" + data.size() + "]" );
    }
}
