package com.Caner.CarRental.Service;

import com.Caner.CarRental.DTO.Request.SaveBrandRequestDto;
import com.Caner.CarRental.DTO.Request.SaveRentalRequestDto;
import com.Caner.CarRental.Mapper.IBrandMapper;
import com.Caner.CarRental.Mapper.IRentalMapper;
import com.Caner.CarRental.Repository.Entity.Brand;
import com.Caner.CarRental.Repository.Entity.Customer;
import com.Caner.CarRental.Repository.Entity.Rental;
import com.Caner.CarRental.Repository.View.IRentalRepository;
import com.Caner.CarRental.utility.ServiceManager;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class RentalService extends ServiceManager<Rental, Long> {

    private final IRentalRepository repository;

    public RentalService(IRentalRepository repository){
        super(repository);
        this.repository=repository;
    }
    public void save(SaveRentalRequestDto dto){
        save(IRentalMapper.INSTANCE.toRental(dto));
    }


}
