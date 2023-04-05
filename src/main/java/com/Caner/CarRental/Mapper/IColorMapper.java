package com.Caner.CarRental.Mapper;


import com.Caner.CarRental.DTO.Request.SaveColorRequestDto;
import com.Caner.CarRental.Repository.Entity.Color;
import com.Caner.CarRental.Repository.View.IColorRepository;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE,componentModel = "spring")
public interface IColorMapper {
    IColorMapper INSTANCE = Mappers.getMapper(IColorMapper.class);

    Color toColor (final SaveColorRequestDto dto);


}
