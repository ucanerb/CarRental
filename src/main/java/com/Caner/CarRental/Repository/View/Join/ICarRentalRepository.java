package com.Caner.CarRental.Repository.View.Join;

import com.Caner.CarRental.Repository.Entity.Car;
import com.Caner.CarRental.Repository.Entity.Join.CarRental;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ICarRentalRepository extends JpaRepository<CarRental, Long> {
@Query(nativeQuery = true, value ="select rntl.rental_id,car.car_name, car.daily_price from tblcar as car \n" +
        "inner join tblrental as rntl on\n" +
        "car.car_id = rntl.car_id")
    List<CarRental> findAllRental();
}
