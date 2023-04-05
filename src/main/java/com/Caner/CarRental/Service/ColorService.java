package com.Caner.CarRental.Service;

import com.Caner.CarRental.DTO.Request.SaveColorRequestDto;
import com.Caner.CarRental.Mapper.IColorMapper;
import com.Caner.CarRental.Repository.Entity.Color;
import com.Caner.CarRental.Repository.View.IColorRepository;
import com.Caner.CarRental.utility.ServiceManager;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ColorService extends ServiceManager<Color, Long> {
    private final IColorRepository repository;

    public ColorService(IColorRepository repository){
        super(repository);
        this.repository=repository;
    }


    public void save (SaveColorRequestDto dto){
        Optional<Color> color = repository.findOptionalByColorNameIgnoreCase(dto.getColorName());
        if(color.isEmpty())
             repository.save(IColorMapper.INSTANCE.toColor(dto));
    }
}
