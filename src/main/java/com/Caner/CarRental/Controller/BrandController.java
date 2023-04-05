package com.Caner.CarRental.Controller;

import com.Caner.CarRental.DTO.Request.SaveBrandRequestDto;
import com.Caner.CarRental.Repository.Entity.Brand;
import com.Caner.CarRental.Service.BrandService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

import java.util.List;

import static com.Caner.CarRental.constant.EndPointList.*;

@RestController
@RequestMapping(BRAND)
@RequiredArgsConstructor
public class BrandController {
    private final BrandService brandService;

    @PostMapping(SAVE)
    public ResponseEntity<Void> save(@RequestBody @Valid SaveBrandRequestDto dto){
        brandService.save(dto);
        return ResponseEntity.ok().build();

    }
    @GetMapping(FIND_ALL)
    public ResponseEntity<List<Brand>> findAll(){
        return ResponseEntity.ok(brandService.findAll());
    }
}
