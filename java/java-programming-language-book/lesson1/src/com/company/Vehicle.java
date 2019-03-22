package com.company;

public class Vehicle {

    public String owner;
    public double speed;
    public double direction;

    Vehicle() {
    }

    Vehicle(String newOwner) {
        this();
        owner = newOwner;
    }
}
