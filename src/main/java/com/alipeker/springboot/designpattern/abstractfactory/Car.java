package com.alipeker.springboot.designpattern.abstractfactory;

public interface Car {

    String getBrand();
    String getModel();
    int getModelYear();
    String getFuelType();

    default void print(){

        System.out.println(getBrand() + " " + getModel() + " / " +
                getModelYear() + " - " + getFuelType());
    }
}
