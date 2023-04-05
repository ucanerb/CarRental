package com.Caner.CarRental.Repository.View;

import com.Caner.CarRental.Repository.Entity.Brand;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface IBrandRepository extends JpaRepository<Brand, Long> {

    Optional<Brand> findOptionalByBrandNameIgnoreCase(String brandName);
}
