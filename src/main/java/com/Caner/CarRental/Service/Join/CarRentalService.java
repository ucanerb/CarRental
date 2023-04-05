package com.Caner.CarRental.Service.Join;

import com.Caner.CarRental.Repository.Entity.Join.CarRental;
import com.Caner.CarRental.Repository.View.Join.ICarRentalRepository;
import com.Caner.CarRental.utility.ServiceManager;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarRentalService extends ServiceManager<CarRental, Long> {
    private final ICarRentalRepository carRentalRepository;

    CarRentalService(ICarRentalRepository carRentalRepository){
        super(carRentalRepository);
        this.carRentalRepository=carRentalRepository;
    }

    public  List<CarRental> findAllRental(){
    return carRentalRepository.findAllRental();
    }


}
