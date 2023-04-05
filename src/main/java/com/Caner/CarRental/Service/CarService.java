package com.Caner.CarRental.Service;

import com.Caner.CarRental.DTO.Request.SaveCarRequestDto;
import com.Caner.CarRental.Mapper.ICarMapper;
import com.Caner.CarRental.Repository.Entity.Car;
import com.Caner.CarRental.Repository.View.ICarRepository;
import com.Caner.CarRental.utility.ServiceManager;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CarService extends ServiceManager<Car, Long> {

    private final ICarRepository repository;

    public CarService (ICarRepository repository){
        super(repository);
        this.repository=repository;
    }
    public void save (SaveCarRequestDto dto){
        save(ICarMapper.INSTANCE.toCar(dto));
    }

    public List<Car> findAllByCarNameStartsWithIgnoreCase(String carName){
        return repository.findAllByCarNameStartsWithIgnoreCase(carName);
    }

    public List<Car> findAllCarByBrandId(Long brandId){
        return repository.findAllCarByBrandId(brandId);
    }

    public List<Car> findAllCarByColorId(Long colorId){
        return repository.findAllCarByColorId(colorId);
    }

    public List<Car> findAllCarByDailyPriceLessThanEqual(int dailyPrice){
        return repository.findAllCarByDailyPriceLessThanEqual(dailyPrice);
    }
}
