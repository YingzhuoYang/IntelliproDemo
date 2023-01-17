package com.example.demo.repository;

import com.example.demo.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.swing.*;

public interface ProductRepository extends JpaRepository<Product,Integer> {
    Product findByName(String name);
}
