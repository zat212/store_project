package com.storesystem.Repository;

import com.storesystem.Model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product,Integer> {

    @Query("SELECT p FROM Product p WHERE p.productCategory LIKE %?1% OR p.productName LIKE %?1%")
    List<Product> findByKeyword(String keyword);
}
