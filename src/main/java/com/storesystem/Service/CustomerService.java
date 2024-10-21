package com.storesystem.Service;

import com.storesystem.Model.Customer;
import com.storesystem.Repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public void saveCus(Customer customer){
        customer.setCusPassword(passwordEncoder.encode(customer.getCusPassword()));
        customerRepository.save(customer);
    }

    public Customer findWithCusId(int cusId){
        return customerRepository.findById(cusId).get();
    }

    public List<Customer> showAllCus(){
        return customerRepository.findAll();
    }

}
