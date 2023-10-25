package com.bookmyshow.dao;

import org.springframework.stereotype.Repository;

import com.bookmyshow.model.Customer;


public interface CustomerDao {

	Customer save(Customer customer);

	Customer get(int id);

	Customer update(Customer customer);

}
