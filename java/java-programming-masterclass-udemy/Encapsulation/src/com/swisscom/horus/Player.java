package com.swisscom.horus;

public class Player {
    public String name;
    public int health;
    public String weapon;

    public void loseHealth(int demage) {
        this.health -= demage;
        if(this.health <= 0) {
            System.out.println("Player knocked out.");
        }
    }

    public int healthRemaining() {
        return this.health;
    }
}
