package com.Examen.promoweb.service;


import com.Examen.promoweb.model.Product;

import java.util.List;

public interface ProductService {
    List<Product> getAllProducts();
    Product getProductById(Long id);
    void addProduct(Product product);
    void updateProduct(Product product);
    boolean deleteProduct(Long id);

}

