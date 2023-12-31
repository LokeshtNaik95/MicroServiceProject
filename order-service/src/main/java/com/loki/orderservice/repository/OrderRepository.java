package com.loki.orderservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.loki.orderservice.entity.OrderEntity;

@Repository
public interface OrderRepository extends JpaRepository<OrderEntity, Long>
{

}
