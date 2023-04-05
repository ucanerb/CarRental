package com.Caner.CarRental.exception;


import lombok.Getter;

@Getter
public class CarRentalException extends RuntimeException{
    private final ErrorType errorType;
    public CarRentalException(ErrorType errorType){
        super(errorType.getMessage());
        this.errorType=errorType;
    }

    public CarRentalException(ErrorType errorType, String message){
        super(message);
        this.errorType=errorType;
    }
}
