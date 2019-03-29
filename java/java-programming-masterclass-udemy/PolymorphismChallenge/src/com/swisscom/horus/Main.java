package com.swisscom.horus;

public class Main {

    public static void main(String[] args) {
	    for(int i = 1; i < 10; i++) {
	        Car car = randomCar();
            System.out.println("Car name: " + car.getName() + "\n" +
                    "Car cylinders count: " + car.getCylinders() + "\n");
        }
    }

    private static Car randomCar() {
        int randomNumber = (int) (Math.random() * 3) + 1;
        switch (randomNumber) {
            case 1:
                return new Toyota();
            case 2:
                return new BMW();
            case 3:
                return new Mercedes();
        }
        return null;
    }
}


