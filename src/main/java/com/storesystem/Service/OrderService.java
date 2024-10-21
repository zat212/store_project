package com.storesystem.Service;

import com.storesystem.Model.Order;
import com.storesystem.Repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    public List<Order> showAllOrder(){
        return orderRepository.findAll();
    }
}
