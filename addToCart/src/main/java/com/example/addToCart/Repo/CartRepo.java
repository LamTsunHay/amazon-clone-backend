package com.example.addToCart.Repo;

import com.example.addToCart.Entity.Cart;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.UUID;

@Repository
public interface CartRepo extends CrudRepository<Cart, Long> {
    Cart save(Cart cart);
    @Modifying
    @Transactional
    void deleteById(Cart cart);
    ArrayList<Cart> findByUserId(UUID userId);

}
