package com.bookmyshow.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bookmyshow.model.Customer;

public interface CustomerRepo extends JpaRepository<Customer, Integer>{

}
