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

    public void addItemToCartService(Cart cart){
        cartRepo.save(cart);
    }

    public void removeItemFromCartService(Cart cart){
        cartRepo.delete(cart);
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
