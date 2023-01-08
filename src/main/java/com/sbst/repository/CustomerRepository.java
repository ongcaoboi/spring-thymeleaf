package com.sbst.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sbst.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {

}
