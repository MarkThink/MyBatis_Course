package com.yixiao.domain;


public class Order {

    //Order实体类中属性名和Orders表中字段不一样
    private int id; // =>order_id
    private String orderNo; // =>order_no
    private float price;// =>order_price

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Order [id="+id+", orderNo="+orderNo+", price="+price+"]";
    }
}
