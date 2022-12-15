package com.example.ecommerceservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.ecommerceservice.entity.Ordering;

@Repository
public interface OrderRepository extends JpaRepository<Ordering, Integer> {

}
