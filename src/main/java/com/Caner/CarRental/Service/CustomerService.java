package com.Caner.CarRental.Service;

import com.Caner.CarRental.DTO.Request.SaveCustomerRequestDto;
import com.Caner.CarRental.Mapper.ICustomerMapper;
import com.Caner.CarRental.Repository.Entity.Color;
import com.Caner.CarRental.Repository.Entity.Customer;
import com.Caner.CarRental.Repository.View.ICustomerRepository;
import com.Caner.CarRental.utility.ServiceManager;
import org.springframework.stereotype.Service;

@Service
public class CustomerService extends ServiceManager<Customer, Long> {
    private final ICustomerRepository repository;
    public CustomerService(ICustomerRepository repository){
        super(repository);
        this.repository=repository;

    }
    public void save (SaveCustomerRequestDto dto){
        save(ICustomerMapper.INSTANCE.toCustomer(dto));
    }

}
