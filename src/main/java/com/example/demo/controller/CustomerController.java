package com.example.demo.controller;

import com.example.demo.entity.Customer;
import com.example.demo.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/customers")
public class CustomerController {

    @Autowired
    private CustomerService service;

    @GetMapping("all")
    public List<Customer> displayAllCustomers(){
      return  service.getAllCustomer();
    }

    @PostMapping("create")
    public Customer createCustomer(@RequestBody Customer customer){
        return service.saveCustomer(customer);
    }

}
