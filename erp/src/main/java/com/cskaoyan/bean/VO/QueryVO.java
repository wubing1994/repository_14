package com.cskaoyan.bean.VO;

import java.util.List;

//这是一个包装类
public class QueryVO<T> {
    private int total;
    private List<T> rows;

    public QueryVO() {
    }

    public QueryVO(int total, List<T> rows) {
        this.total = total;
        this.rows = rows;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public List<T> getRows() {
        return rows;
    }

    public void setRows(List<T> rows) {
        this.rows = rows;
    }
}