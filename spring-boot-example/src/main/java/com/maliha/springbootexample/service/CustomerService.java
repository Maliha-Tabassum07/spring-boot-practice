package com.maliha.springbootexample.service;

import com.maliha.springbootexample.model.Customer;
import com.maliha.springbootexample.records.CustomerRequest;
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
    public void addCustomer(CustomerRequest customerRequest){
        Customer customer=new Customer();
        customer.setName(customerRequest.name());
        customer.setAge(customerRequest.age());
        customer.setEmail(customerRequest.email());
        customerRepository.save(customer);
    }
}
