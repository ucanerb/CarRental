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
@Table(name = "tbl_carcolorbrand")
public class CarColorBrand {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long carId;
    String car_name;
    String color_name;
    String brand_name;
}