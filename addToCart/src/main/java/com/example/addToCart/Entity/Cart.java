package com.example.addToCart.Entity;

import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.UUID;

@Entity(name = "cart")
public class Cart{
    @Id
    @GeneratedValue
    private long id;

    @Type(type="org.hibernate.type.UUIDCharType")
    private UUID userId;

    @Type(type="org.hibernate.type.UUIDCharType")
    private UUID productId;

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
