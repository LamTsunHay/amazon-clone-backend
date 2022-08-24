package com.example.productdataservice.Repo;

import com.example.productdataservice.Entity.Product;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.UUID;

@Repository
public interface ProductRepo extends MongoRepository<Product, BigInteger> {
    Product save(Product product);
    ArrayList<Product> findAll();
    Product findByProductId(UUID productId);

    ArrayList<Product> findByNameContainsIgnoreCase(String keyword);
}
