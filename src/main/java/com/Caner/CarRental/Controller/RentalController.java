package com.Caner.CarRental.Controller;

import com.Caner.CarRental.DTO.Request.SaveCarRequestDto;
import com.Caner.CarRental.DTO.Request.SaveRentalRequestDto;
import com.Caner.CarRental.Repository.Entity.Join.CarCustomerRental;
import com.Caner.CarRental.Repository.Entity.Join.CarRental;
import com.Caner.CarRental.Repository.Entity.Rental;
import com.Caner.CarRental.Service.Join.CarCustomerRentalService;
import com.Caner.CarRental.Service.Join.CarRentalService;
import com.Caner.CarRental.Service.RentalService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

import java.util.List;

import static com.Caner.CarRental.constant.EndPointList.*;

@RestController
@RequestMapping(RENTAL)
@RequiredArgsConstructor
public class RentalController {
    private final RentalService rentalService;
    private final CarRentalService carRentalService;
    private final CarCustomerRentalService carCustomerRentalService;
@PostMapping(SAVE)
    public ResponseEntity<Void> save(@RequestBody SaveRentalRequestDto dto){
        rentalService.save(dto);
        return ResponseEntity.ok().build();
    }

    @GetMapping(FIND_ALL)
    public ResponseEntity<List<Rental>> findAll(){
        return ResponseEntity.ok(rentalService.findAll());
    }

    @GetMapping(FIND_ALL_RENTALS)
    public ResponseEntity<List<CarRental>> findAllRental(){
    return ResponseEntity.ok(carRentalService.findAllRental());
    }

    @GetMapping(FIND_ALL_RENTALS_AND_CUSTOMER)
    public ResponseEntity<List<CarCustomerRental>> findAllRentalAndCustomer(){
    return ResponseEntity.ok(carCustomerRentalService.findAllRentalAndCustomer());
    }
}
