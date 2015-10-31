package com.yixiao.domain;

public class Student {

    //定义属性 和Student表中的字段对应
    private int id; // => s_id
    private String name; // => s_name

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student [id="+id+", name="+name+"]";
    }
}
