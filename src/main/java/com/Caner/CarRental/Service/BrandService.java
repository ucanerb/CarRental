package com.Caner.CarRental.Service;

import com.Caner.CarRental.DTO.Request.SaveBrandRequestDto;
import com.Caner.CarRental.Mapper.IBrandMapper;
import com.Caner.CarRental.Repository.Entity.Brand;
import com.Caner.CarRental.Repository.View.IBrandRepository;
import com.Caner.CarRental.utility.ServiceManager;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BrandService extends ServiceManager<Brand,Long> {
    private final IBrandRepository repository;

    public BrandService(IBrandRepository repository){
        super(repository);
        this.repository=repository;
    }

    public void save(SaveBrandRequestDto dto){
    Optional<Brand> brand = repository.findOptionalByBrandNameIgnoreCase(dto.getBrandName());
           if(brand.isEmpty())
              repository.save(IBrandMapper.INSTANCE.toBrand(dto));

    }
}
