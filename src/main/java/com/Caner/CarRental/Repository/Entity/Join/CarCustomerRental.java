package com.Caner.CarRental.Repository.Entity.Join;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tblcarcustomerrental")
public class CarCustomerRental {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long rentalId;
    String car_name;
    String rent_date;
    String brand_name;
    String company_name;



}
