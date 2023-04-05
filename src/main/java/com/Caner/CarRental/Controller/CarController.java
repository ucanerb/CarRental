package com.Caner.CarRental.Controller;

import com.Caner.CarRental.DTO.Request.SaveCarRequestDto;
import com.Caner.CarRental.Repository.Entity.Car;
import com.Caner.CarRental.Repository.Entity.Join.CarColorBrand;
import com.Caner.CarRental.Service.CarService;
import com.Caner.CarRental.Service.Join.CarColorBrandService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

import static com.Caner.CarRental.constant.EndPointList.*;

@RestController
@RequestMapping(CAR)
@RequiredArgsConstructor
public class CarController {
    private final CarService carService;
    private final CarColorBrandService carColorBrandService;

    @PostMapping(SAVE)
    public ResponseEntity<Void> save(@RequestBody @Valid SaveCarRequestDto dto){
    carService.save(dto);
    return ResponseEntity.ok().build();
    }

    @GetMapping(FIND_ALL)
    public ResponseEntity<List<Car>> findAll(){
        return ResponseEntity.ok(carService.findAll());
    }

    @GetMapping(FIND_BY_NAME)
    public ResponseEntity<List<Car>> findAllByCarNameStartsWithIgnoreCase(@PathVariable String carName){
        return ResponseEntity.ok(carService.findAllByCarNameStartsWithIgnoreCase(carName));
    }

    @GetMapping(FIND_ALL_CAR_BY_BRANDID)
    public ResponseEntity<List<Car>> findAllCarByBrandId(@PathVariable Long brandId){
        return ResponseEntity.ok(carService.findAllCarByBrandId(brandId));
    }

    @GetMapping(FIND_ALL_CAR_BY_COLORID)
    public ResponseEntity<List<Car>> findAllCarByColorId(@PathVariable Long colorId){
        return ResponseEntity.ok(carService.findAllCarByColorId(colorId));
    }

    @GetMapping(FIND_ALL_CAR_COLOR_BRAND)
    public ResponseEntity<List<CarColorBrand>> findCarColorBrand(){
        return ResponseEntity.ok(carColorBrandService.CarColorBrand());
    }

    @GetMapping(FIND_ALL_CAR_BY_PRICE)
    public ResponseEntity<List<Car>> findAllCarByDailyPriceLessThanEqual(int dailyPrice){
        return ResponseEntity.ok(carService.findAllCarByDailyPriceLessThanEqual(dailyPrice));
    }
}
