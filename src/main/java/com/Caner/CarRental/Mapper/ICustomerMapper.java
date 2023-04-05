package com.Caner.CarRental.Mapper;


import com.Caner.CarRental.DTO.Request.SaveCustomerRequestDto;
import com.Caner.CarRental.Repository.Entity.Customer;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE,componentModel = "spring")
public interface ICustomerMapper {

    ICustomerMapper INSTANCE = Mappers.getMapper(ICustomerMapper.class);

    Customer toCustomer (final SaveCustomerRequestDto dto);
}
