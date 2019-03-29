package com.swisscom.horus;

public class Car {
    private int wheels;
    public int cylinders;
    private String name;
    private boolean engine;

    public Car(String name, int cylinders) {
        this.wheels = 4;
        this.engine = true;
        this.name = name;
        this.cylinders = cylinders;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }

    public void startEngine() {
        System.out.println("Engine started");
    }

    public void accelerate(int speed) {
        System.out.println("Acelerating to " + speed);
    }

    public void brake() {
        System.out.println("Brake initiated!!!");
    }
}