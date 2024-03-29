package com.sukumar.customerservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sukumar.customerservice.entity.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long>{

}
