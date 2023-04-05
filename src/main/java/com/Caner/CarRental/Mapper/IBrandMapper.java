package com.Caner.CarRental.Mapper;

import com.Caner.CarRental.DTO.Request.SaveBrandRequestDto;
import com.Caner.CarRental.Repository.Entity.Brand;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface IBrandMapper {
    IBrandMapper INSTANCE = Mappers.getMapper(IBrandMapper.class);

    Brand toBrand (final SaveBrandRequestDto dto);

}
