package com.Caner.CarRental.Controller;

import com.Caner.CarRental.DTO.Request.SaveColorRequestDto;
import com.Caner.CarRental.Repository.Entity.Color;
import com.Caner.CarRental.Service.ColorService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static com.Caner.CarRental.constant.EndPointList.*;

@RestController
@RequestMapping(COLOR)
@RequiredArgsConstructor
public class ColorController {
    private final ColorService colorService;

    @PostMapping(SAVE)
    public ResponseEntity<Void> save(SaveColorRequestDto dto){
        colorService.save(dto);
        return ResponseEntity.ok().build();

    }
    @GetMapping(FIND_ALL)
    public ResponseEntity<List<Color>> findAll(){
       return ResponseEntity.ok(colorService.findAll());
    }
}
