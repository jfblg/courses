package com.swisscom.horus;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Player player = new Player();
        player.name = "Jim";
        player.health = 100;
        player.weapon = "sword";

        int demage = 20;
        player.loseHealth(demage);
        System.out.println("Remaining health " + player.healthRemaining());

        demage = 30;
        player.loseHealth(demage);
        System.out.println("Remaining health " + player.healthRemaining());
    }
}
