package com.example.demo.entity;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "tg_good_info")
@Data
public class GoodInfoEntityForUnitTest {
    //商品编号
    @Id
    @Column(name = "tg_id")
    @GeneratedValue
    private Integer tgId;
    //商品类型编号
    @Column(name = "tg_type_id")
    private Integer typeId;

    //商品标题
    @Column(name = "tg_title")
    private String title;

    //商品价格
    @Column(name = "tg_price")
    private double price;

    //商品排序
    @Column(name = "tg_order")
    private int order;

    public Integer getTgId() {
        return tgId;
    }

    public void setTgId(Integer tgId) {
        this.tgId = tgId;
    }

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }


}