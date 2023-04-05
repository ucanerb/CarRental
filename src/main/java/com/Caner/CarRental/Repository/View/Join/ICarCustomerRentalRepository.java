package com.Caner.CarRental.Repository.View.Join;

import com.Caner.CarRental.Repository.Entity.Join.CarCustomerRental;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface ICarCustomerRentalRepository extends JpaRepository<CarCustomerRental, Long> {

    @Query(nativeQuery = true,value = "select rntl.rental_id, rntl.rent_date,car.car_name,brnd.brand_name, cst.company_name from tblcar as car \n" +
            "inner join tblrental as rntl on\n" +
            "car.car_id = rntl.car_id\n" +
            "inner join tblbrand as brnd on\n" +
            "car.brand_id = brnd.brand_id\n" +
            "inner join tblcustomer as cst on\n" +
            "rntl.customer_id = cst.customer_id")
    List<CarCustomerRental> findAllRentalAndCustomer();

}
