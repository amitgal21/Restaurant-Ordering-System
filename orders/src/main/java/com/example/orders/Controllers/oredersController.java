package com.example.orders.Controllers;


import com.example.orders.Controllers.oredersController;
import com.example.orders.Entity.OrderEntity;
import com.example.orders.Service.OrderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;


@RestController
public class oredersController {

    private final OrderService OrderService;

    public oredersController(com.example.orders.Service.OrderService orderService){

        this.OrderService = orderService;
    }

    @GetMapping("/orders")
    public List<OrderEntity> findAllOrders() {
        return OrderService.getAllOrders();
    }

}


