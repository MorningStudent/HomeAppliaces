package main;

import appliances.Boiler;

public class App {

    public static void main(String[] args) {
        
        Boiler b = new Boiler();

        System.out.println(b.getPowerConsumption());
        System.out.println(b.getTemperature());

    }
}