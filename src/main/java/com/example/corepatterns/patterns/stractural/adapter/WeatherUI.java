package com.example.corepatterns.patterns.stractural.adapter;

public class WeatherUI {


    public static void main(String[] args) {
        showTemperature(0);
    }
    public static void showTemperature(int zipCode){
    WeatherAdapter adapter=new WeatherAdapter();

    System.out.println("Temperature: "+adapter.findTemperature(19406)+"C");
    }
}
