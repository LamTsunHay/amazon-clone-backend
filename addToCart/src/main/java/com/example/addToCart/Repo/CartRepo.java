package com.example.addToCart.Repo;

import com.example.addToCart.Entity.Cart;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.UUID;

@Repository
public interface CartRepo extends CrudRepository<Cart, Long> {
    public Cart save(Cart cart);
    public void deleteById(long id);
    public ArrayList<Cart> findByUserId(UUID userId);

}
