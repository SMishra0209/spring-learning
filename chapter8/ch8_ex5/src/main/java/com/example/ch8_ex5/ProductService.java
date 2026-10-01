package com.example.ch8_ex5;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {

    private List<Product> products = new ArrayList<>();

    public void addProduct(Product p){
        products.add(p);
    }
    public List<Product> getProducts(){
        return products;
    }

    public Object findAll() {
        return products;
    }
}

