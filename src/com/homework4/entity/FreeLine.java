package com.homework4.entity;

public class FreeLine {
    private int id;
    private Double data;
    private String name;

    public FreeLine(int id, Double data, String name) {
        this.id = id;
        this.data = data;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Double getData() {
        return data;
    }

    public void setData(Double data) {
        this.data = data;
    }

    public String getName() {
        return name;
    }
}

