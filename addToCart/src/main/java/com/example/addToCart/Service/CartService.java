package com.example.addToCart.Service;

import com.example.addToCart.Entity.Cart;
import com.example.addToCart.Entity.Product;
import com.example.addToCart.Entity.ProductFormatter;
import com.example.addToCart.Repo.CartRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.UUID;

@Service
public class CartService {

    @Autowired
    CartRepo cartRepo;

    @Autowired
    ProductDetailsProxy productDetailsProxy;

    public Cart addItemToCartService(Cart cart){
        return cartRepo.save(cart);
    }

    public void removeItemFromCartService(Cart cart){
        UUID userId = cart.getUserId();
        ArrayList<Cart> cartList = cartRepo.findByUserId(userId);
        for(Cart item:cartList){
            if(cart.getProductId().toString().equals(item.getProductId().toString())){
                cartRepo.deleteById(item.getId());
                return;
            }
        }
    }

    public ProductFormatter displayAllProducts(UUID userId){
        ArrayList<Cart> cartList = cartRepo.findByUserId(userId);
        ArrayList<Product> productList = new ArrayList<>();
        ProductFormatter productFormatter = new ProductFormatter();
        productFormatter.setUserId(userId);
        for(int i=0;i<cartList.size();i++){
            Product smallProduct = productDetailsProxy.getProductById(cartList.get(i).getProductId());
            productList.add(smallProduct);
        }
        productFormatter.setList(productList);

        return productFormatter;
    }
}
