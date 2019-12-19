package com.example.net.entity;

import java.util.ArrayList;
import java.util.List;

public class InfoWithSize {

    List<Info> list = new ArrayList<>();
    int size = 0;

    public InfoWithSize(List<Info> list, int size) {
        this.list = list;
        this.size = size;
    }

    public List<Info> getList() {
        return list;
    }

    public void setList(List<Info> list) {
        this.list = list;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
