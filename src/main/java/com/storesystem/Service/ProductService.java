package com.storesystem.Service;

import com.storesystem.Model.Product;
import com.storesystem.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public void addProduct(Product product){
        productRepository.save(product);
    }

    public Product findByProdId(int prodId){
        return productRepository.findById(prodId).get();
    }

    public List<Product> findAllProduct(){
        return productRepository.findAll();
    }

    public void deleteProduct(int proId){
        productRepository.deleteById(proId);
    }

}
