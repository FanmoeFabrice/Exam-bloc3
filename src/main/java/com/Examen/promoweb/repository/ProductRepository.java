package com.Examen.promoweb.repository;



import com.Examen.promoweb.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> findByLabel(String label);
    List<Product> findByCategory(String category);

}

