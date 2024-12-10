package com.example.orders.Query;

import com.example.orders.Entity.OrderEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import java.util.List;

public interface OrderQuery extends JpaRepository<OrderEntity, Long> {

    // get all orders from db
    @Query(value = "SELECT * FROM orders_schema.orders", nativeQuery = true)
    List<OrderEntity> findAllOrders();
}
