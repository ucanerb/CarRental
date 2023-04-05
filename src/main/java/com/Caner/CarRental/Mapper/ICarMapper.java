package com.Caner.CarRental.Mapper;

import com.Caner.CarRental.DTO.Request.SaveCarRequestDto;
import com.Caner.CarRental.Repository.Entity.Car;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE,componentModel = "spring")
public interface ICarMapper {
    ICarMapper INSTANCE = Mappers.getMapper(ICarMapper.class);

    Car toCar(final SaveCarRequestDto dto);
}
