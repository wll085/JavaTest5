package com.hand.exam1.entity;

public class Page {
    private int pagesSize;
    private int page;
    private String sort = "ASC";

    public Page(int pagesSize,int page){
        this.pagesSize=pagesSize;
        this.page=page;
    }

    public int getPagesSize() {
        return pagesSize;
    }

    public void setPagesSize(int pagesSize) {
        this.pagesSize = pagesSize;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public String getSort() {
        return sort;
    }
}
