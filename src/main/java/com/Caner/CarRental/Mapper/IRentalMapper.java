package com.Caner.CarRental.Mapper;

import com.Caner.CarRental.DTO.Request.SaveRentalRequestDto;
import com.Caner.CarRental.Repository.Entity.Rental;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE,componentModel = "spring")
public interface IRentalMapper {

    IRentalMapper INSTANCE = Mappers.getMapper(IRentalMapper.class);

    Rental toRental (final SaveRentalRequestDto dto);
}
