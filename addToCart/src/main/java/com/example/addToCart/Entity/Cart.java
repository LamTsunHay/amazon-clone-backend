package com.example.addToCart.Entity;

import org.hibernate.annotations.Type;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.UUID;

@Entity(name = "Cart")
public class Cart {
    @Id
    @GeneratedValue
    public long id;

    @Type(type="org.hibernate.type.UUIDCharType")
    public UUID userId;
    @Type(type="org.hibernate.type.UUIDCharType")
    public UUID productId;

    public Cart() {
    }

    public Cart(long id, UUID userId, UUID productId) {
        this.id = id;
        this.userId = userId;
        this.productId = productId;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public UUID getUserId() {
        return userId;
    }

    public void setUserId(UUID userId) {
        this.userId = userId;
    }

    public UUID getProductId() {
        return productId;
    }

    public void setProductId(UUID productId) {
        this.productId = productId;
    }
}
