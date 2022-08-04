package com.example.corepatterns.patterns.stractural.adapter;

public class WeatherAdapter {

    public int findTemperature(int zipCode){
        String city=null;

        if(zipCode==19406)
            city="King of prussia";

        WeatherFinder finder=new WeatherFinderImpl();
        int temperature=finder.find(city);
        return temperature;
    }
}
