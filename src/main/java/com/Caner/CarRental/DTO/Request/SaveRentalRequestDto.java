package com.Caner.CarRental.DTO.Request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SaveRentalRequestDto {

    String rentDate;
    Long customerId;
    Long carId;
}
