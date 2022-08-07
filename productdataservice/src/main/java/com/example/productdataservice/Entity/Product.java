package com.example.productdataservice.Entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.GeneratedValue;
import java.math.BigInteger;
import java.util.UUID;

@Document
public class Product{
    @Id
    @GeneratedValue
    public BigInteger id;

    public UUID productId;

    public String name;
    public double price;
    public double rating;
    public String imageURL;

    public Product() {
    }

    public Product(BigInteger id, UUID productId, String name, double price, double rating, String imageURL) {
        this.id = id;
        this.productId = productId;
        this.name = name;
        this.price = price;
        this.rating = rating;
        this.imageURL = imageURL;
    }

    public BigInteger getId() {
        return id;
    }

    public void setId(BigInteger id) {
        this.id = id;
    }

    public UUID getProductId() {
        return productId;
    }

    public void setProductId(UUID productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }
}
