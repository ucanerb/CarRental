package com.Caner.CarRental.Repository.View;

import com.Caner.CarRental.Repository.Entity.Brand;
import com.Caner.CarRental.Repository.Entity.Rental;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface IRentalRepository extends JpaRepository<Rental, Long> {

}
