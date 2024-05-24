package com.maliha.springbootexample.service;

import com.maliha.springbootexample.model.Customer;
import com.maliha.springbootexample.repository.CustomerRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {
    final private CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public List<Customer> getAllCustomers(){
        return  customerRepository.findAll();
    }
}
