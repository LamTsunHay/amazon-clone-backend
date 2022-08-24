package com.example.productdataservice.Service;

import com.example.productdataservice.Entity.Product;
import com.example.productdataservice.Repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.UUID;

@Service
public class ProductService {
    @Autowired
    ProductRepo productRepo;
    public Product saveDataToDB(Product product){
        product.setProductId(UUID.randomUUID());
        return productRepo.save(product);
    }

    public ArrayList<Product> findAllProducts(){
        return productRepo.findAll();
    }

    public Product getProductDetails(UUID productId){
        return productRepo.findByProductId(productId);
    }

    public ArrayList<Product> searchProductsByKeyword(String keyword){
        return productRepo.findByNameContainsIgnoreCase(keyword);
    }
}
