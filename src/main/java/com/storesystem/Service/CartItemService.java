package com.storesystem.Service;

import com.storesystem.Model.CartItem;
import com.storesystem.Model.Customer;
import com.storesystem.Model.Product;
import com.storesystem.Repository.CartItemRepository;
import com.storesystem.Repository.CustomerRepository;
import com.storesystem.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartItemService {

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private CartItemRepository cartItemRepository;

    @Autowired
    private ProductRepository productRepository;


    public List<CartItem> findWithCustomer(Customer customer){
        return cartItemRepository.findCartItemByCustomer(customer);
    }

    public void addToCart(int cusId,int prodId,int prodQty){
        Customer customerBuy = customerRepository.findById(cusId).orElse(null);
        Product cusBuyProd = productRepository.findById(prodId).orElse(null);
        if(customerBuy!=null && cusBuyProd!=null){
            float productPrice = cusBuyProd.getProductPrice();
            float totalPrice = productPrice * prodQty;
            CartItem cartItem = new CartItem(
                    customerBuy,
                    cusBuyProd,
                    prodQty,
                    productPrice,
                    totalPrice,
                    cusBuyProd.getShop().getShopName());
            cartItemRepository.save(cartItem);
        }else
            throw new RuntimeException("Customer or Product not found");

    }

    public float showTotalPrice(Customer customer){
        List<CartItem> customerTotalPrice = cartItemRepository.findCartItemByCustomer(customer);
        float totalCartPrice = 0;
        for (CartItem item : customerTotalPrice) {
            totalCartPrice += item.getTotalPrice();
        }
        return totalCartPrice;
    }
    
}
