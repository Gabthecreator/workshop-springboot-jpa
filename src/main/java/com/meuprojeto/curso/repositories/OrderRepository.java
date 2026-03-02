package com.meuprojeto.curso.repositories;

import com.meuprojeto.curso.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
