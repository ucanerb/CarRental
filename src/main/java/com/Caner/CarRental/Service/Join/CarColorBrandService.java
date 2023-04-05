package com.Caner.CarRental.Service.Join;

import com.Caner.CarRental.Repository.Entity.Join.CarColorBrand;
import com.Caner.CarRental.Repository.View.Join.ICarColorBrandRepository;
import com.Caner.CarRental.utility.ServiceManager;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarColorBrandService extends ServiceManager<CarColorBrand, Long> {
    private final ICarColorBrandRepository carColorBrandRepository;

    public CarColorBrandService (ICarColorBrandRepository carColorBrandRepository){
        super(carColorBrandRepository);
        this.carColorBrandRepository=carColorBrandRepository;
    }

    public List<CarColorBrand> CarColorBrand(){
        return carColorBrandRepository.findCarColorBrand();
    }

}
