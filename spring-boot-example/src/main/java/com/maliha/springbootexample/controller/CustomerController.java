package com.maliha.springbootexample.controller;

import com.maliha.springbootexample.model.Customer;
import com.maliha.springbootexample.records.CustomerRequest;
import com.maliha.springbootexample.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customer")
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @GetMapping("/all")
    public List<Customer> getAllCustomers(){
        return customerService.getAllCustomers();
    }


    @PostMapping("/add")
    public void addCustomer(@RequestBody CustomerRequest customerRequest){
        customerService.addCustomer(customerRequest);
    }
    @DeleteMapping("/delete/{customerId}")
    public void deleteCustomerById(@PathVariable("customerId") Integer id){
        customerService.deleteCustomer(id);
    }
    @PutMapping("/update/{customerId}")
    public void updateCustomer(@RequestBody CustomerRequest customerRequest, @PathVariable("customerId") Integer id){
        customerService.updateCustomer(id, customerRequest);
    }
}
