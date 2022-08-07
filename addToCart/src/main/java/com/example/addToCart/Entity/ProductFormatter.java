package com.example.addToCart.Entity;


import java.util.ArrayList;
import java.util.UUID;

public class ProductFormatter {
    UUID userId;

    ArrayList<Product> list;


    public UUID getUserId() {
        return userId;
    }

    public void setUserId(UUID userId) {
        this.userId = userId;
    }

    public ArrayList<Product> getList() {
        return list;
    }

    public void setList(ArrayList<Product> list) {
        this.list = list;
    }
}
