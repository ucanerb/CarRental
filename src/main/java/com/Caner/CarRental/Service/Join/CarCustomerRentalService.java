package com.Caner.CarRental.Service.Join;

import com.Caner.CarRental.Repository.Entity.Join.CarCustomerRental;
import com.Caner.CarRental.Repository.View.Join.ICarCustomerRentalRepository;
import com.Caner.CarRental.utility.ServiceManager;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarCustomerRentalService extends ServiceManager<CarCustomerRental,Long> {

    private final ICarCustomerRentalRepository carCustomerRentalRepository;

    CarCustomerRentalService(ICarCustomerRentalRepository carCustomerRentalRepository){
        super(carCustomerRentalRepository);
        this.carCustomerRentalRepository=carCustomerRentalRepository;
    }

    public List<CarCustomerRental> findAllRentalAndCustomer(){
        return carCustomerRentalRepository.findAllRentalAndCustomer();
    }



}
