package com.example.addToCart.Controller;

import com.example.addToCart.Entity.Cart;
import com.example.addToCart.Entity.Product;
//import com.example.addToCart.Entity.ProductFormatter;
import com.example.addToCart.Entity.ProductFormatter;
import com.example.addToCart.Service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.UUID;

@RestController
@RequestMapping("/amazon/addToCart")
public class CartController {

    @Autowired
    CartService cartService;

    @PostMapping("/add")
    public void addToCart(@RequestBody Cart cart){
        cartService.addItemToCartService(cart);
    }

    @DeleteMapping("/remove/{userId}/{productId}")
    public void removeFromCart(@PathVariable UUID userId, @PathVariable UUID productId){
        cartService.removeItemFromCartService(userId, productId);
    }

    @GetMapping("/show/{userId}")
    public ProductFormatter showItems(@PathVariable UUID userId){
        return cartService.displayAllProducts(userId);
    }

}
