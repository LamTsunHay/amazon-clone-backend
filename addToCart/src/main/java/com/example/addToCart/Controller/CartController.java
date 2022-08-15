package com.example.addToCart.Controller;

import com.example.addToCart.Entity.Cart;
import com.example.addToCart.Entity.ProductFormatter;
import com.example.addToCart.Service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@CrossOrigin
@RestController
@RequestMapping("/amazon/addToCart")
public class CartController {

    @Autowired
    CartService cartService;

    @PostMapping("/add")
    public Cart addToCart(@RequestBody Cart cart){
        return cartService.addItemToCartService(cart);
    }

    @DeleteMapping("/remove")
    public void removeFromCart(@RequestBody Cart cart){
        cartService.removeItemFromCartService(cart);
    }

    @GetMapping("/show/{userId}")
    public ProductFormatter showItems(@PathVariable UUID userId){
        return cartService.displayAllProducts(userId);
    }

}
