package com.storesystem.Repository;

import com.storesystem.Model.CartItem;
import com.storesystem.Model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CartItemRepository extends JpaRepository<CartItem,Integer> {

    List<CartItem> findCartItemByCustomer(Customer customer);
}
