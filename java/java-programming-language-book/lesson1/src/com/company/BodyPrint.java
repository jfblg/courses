package com.company;

public class BodyPrint {
    public static void main(String[] args) {
        Body sun = new Body("Sol", null);
        Body earth = new Body("Earth", sun);

        System.out.println("Body: " + earth.name + " with orbit: "
        + earth.orbit.name + " and ID: " + earth.idNum);
    }
}
