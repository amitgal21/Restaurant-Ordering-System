package com.example.orders.Service;


import com.example.orders.Entity.OrderEntity;
import com.example.orders.Query.OrderQuery;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class OrderService {
    private final OrderQuery OrderQuery;

    public OrderService(OrderQuery orderQuery) {
        OrderQuery = orderQuery;
    }

    public List<OrderEntity> getAllOrders() {
        return OrderQuery.findAllOrders();
    }
}


/*package com.resturant.users.Service;

import com.resturant.users.Entity.UserEntity;
import com.resturant.users.query.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<UserEntity> getAllUsers() {
        return userRepository.findAllUsers();
    }
}
*/