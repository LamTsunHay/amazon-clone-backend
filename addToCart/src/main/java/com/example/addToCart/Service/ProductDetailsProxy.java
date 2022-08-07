package com.example.addToCart.Service;

import com.example.addToCart.Entity.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.UUID;

@FeignClient(name = "product-details", url = "localhost:8082")
public interface ProductDetailsProxy {

    @GetMapping("/amazon/products/search/{productId}")
    public Product getProductById(@PathVariable UUID productId);
}
