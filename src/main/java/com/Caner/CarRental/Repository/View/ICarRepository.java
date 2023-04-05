package com.Caner.CarRental.Repository.View;

import com.Caner.CarRental.Repository.Entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ICarRepository extends JpaRepository<Car, Long> {

    /**
     * OPTIONAL CÜNKÜ VARSA DOLU DÖNECEK YOKSA BOŞ DÖNECEK,
     * aynı isimde araç olup olmadığını kontrol ediyoruz
     */
    Optional<Car> findOptionalByCarNameIgnoreCase(String carName);

    List<Car> findAllByCarNameStartsWithIgnoreCase(String carName);

    List<Car> findAllCarByBrandId(Long brandId);

    List<Car> findAllCarByColorId(Long colorId);

    List<Car> findAllCarByDailyPriceLessThanEqual(int dailyPrice);






}
