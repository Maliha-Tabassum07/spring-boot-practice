package com.maliha.springbootexample.repository;

import com.maliha.springbootexample.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,Integer> {
}
