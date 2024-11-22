package com.vasiliskardaras.microservices.order.repository;

import com.vasiliskardaras.microservices.order.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
