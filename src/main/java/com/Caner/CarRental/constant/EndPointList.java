package com.Caner.CarRental.constant;

public class EndPointList {
    public static final String PREF = "/dev";
    public static final String VERSIONS = "/v1";
    public static final String USER = PREF + VERSIONS + "/user";
    public static final String CAR = "/car";
    public static final String COLOR = "/color";
    public static final String BRAND = "/brand";
    public static final String CUSTOMER = "/customer";
    public static final String RENTAL = "/rental";
    public static final String SAVE = "/save";
    public static final String FIND_ALL = "/findall";
    public static final String FIND_ALL_RENTALS = "/find-all-rentals";
    public static final String FIND_ALL_RENTALS_AND_CUSTOMER = "/find-all-rentals-and-customer";
    public static final String FIND_BY_NAME = "//find-by-name-starts-with/{carName}";
    public static final String FIND_ALL_CAR_BY_BRANDID = "/find-all-car-by-brand-id/{brandId}";
    public static final String FIND_ALL_CAR_BY_COLORID = "/find-all-car-by-color-id/{colorId}";
    public static final String FIND_ALL_CAR_COLOR_BRAND = "/find-all-car-color-brand";
    public static final String FIND_ALL_CAR_BY_PRICE = "/find-all-car-by-daily-price";
}
