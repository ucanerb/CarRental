package com.Caner.CarRental.DTO.Request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SaveCarRequestDto {
    String carName;
    int modelYear;
    int dailyPrice;
    String description;
    Long colorId;
    Long brandId;


}
