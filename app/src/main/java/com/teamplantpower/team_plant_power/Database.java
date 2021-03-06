package com.teamplantpower.team_plant_power;


import java.util.Random;

public class Database {
    private static Random r = new Random();
    public double getLightData() {
        return randomInRange(0,100);
    }
    public double getHumidityData() {
        return randomInRange(0,100);
    }
    public double getTemperatureData() {
        return randomInRange(0, 30);
    }

    private static double randomInRange(double min, double max) {
        return Math.round((min + (max - min) *  r.nextDouble()) * 100.0)/100.0;
    }

}
