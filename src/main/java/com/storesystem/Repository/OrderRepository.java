package com.storesystem.Repository;

import com.storesystem.Model.Order;
import org.aspectj.weaver.ast.Or;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface OrderRepository extends JpaRepository<Order,Integer> {
//    @Query("SELECT o FROM Order o WHERE o.")
//    List<Order> findByKeyword(String keyword);
}
