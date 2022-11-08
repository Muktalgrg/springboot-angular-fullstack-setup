package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Customer;



public interface CustomerService {
    List<Customer> getAllCustomers();
    Customer getCustomerById(Long id);
    void deleteCustomerById(Long id);
    Customer createCustomer(Customer customer);
    Customer updateCustomer(Customer customer);
}
