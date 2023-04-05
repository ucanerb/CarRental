package com.Caner.CarRental.Repository.View.Join;

import com.Caner.CarRental.Repository.Entity.Join.CarColorBrand;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ICarColorBrandRepository extends JpaRepository <CarColorBrand, Long>
        {
            @Query(nativeQuery = true,
                    value ="select car.car_id, car.car_name, clr.color_name, brnd.brand_name from tblcar as car inner join tblcolor as clr on\n" +
                    "car.color_id = clr.color_id\n" +
                    "inner join tblbrand as brnd on \n" +
                    "car.brand_id = brnd.brand_id")
            List<CarColorBrand> findCarColorBrand();
}
