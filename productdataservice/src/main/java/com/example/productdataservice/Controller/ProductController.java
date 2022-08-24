package com.example.productdataservice.Controller;

import com.example.productdataservice.Entity.Product;
import com.example.productdataservice.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.UUID;

@CrossOrigin
@RestController
@RequestMapping("/amazon/products")
public class ProductController {

    @Autowired
    ProductService productService;

    @PostMapping("/save")
    public Product saveData(@RequestBody Product product){
        return productService.saveDataToDB(product);
    }

    @GetMapping("/getAllProducts")
    public ArrayList<Product> getAllProducts(){
        return productService.findAllProducts();
    }

    @GetMapping("/search/{productId}")
    public Product getProductById(@PathVariable UUID productId){
        return productService.getProductDetails(productId);
    }

    @GetMapping("/search")
    public ArrayList<Product> getSearchProductsByKeyWord(@RequestParam("keyword") String keyword){
        return productService.searchProductsByKeyword(keyword);
    }
}
