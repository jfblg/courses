package com.company;

/**
 * Body is an example object
 * @param name
 * @param orbit
 */

public class Body {
    public long idNum = 0;
    public String name = "<unnamed>";
    public Body orbit = null;
    public static long nextID = 0;

    Body(){
        idNum = Body.nextID++;
    }

    Body(String bodyName, Body orbitArround) {
        this();
        name = bodyName;
        orbit = orbitArround;
    }

    Body(String bodyName) {
        this(bodyName, null);
    }
}

//Body mercury;

