package com.Caner.CarRental.Repository.View;

import com.Caner.CarRental.Repository.Entity.Brand;
import com.Caner.CarRental.Repository.Entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ICustomerRepository extends JpaRepository<Customer, Long> {


    Optional<Customer> findOptionalByCustomerNameIgnoreCase(String customerName);}
