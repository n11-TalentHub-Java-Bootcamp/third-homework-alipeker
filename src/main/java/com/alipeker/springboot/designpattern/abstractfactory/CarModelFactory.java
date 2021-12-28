package com.alipeker.springboot.designpattern.abstractfactory;

public interface CarModelFactory {

    Car produceCar(String model, String fuelType);
}
