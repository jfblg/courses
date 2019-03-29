package com.swisscom.horus;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Dimensions dimensions = new Dimensions(200, 300, 20 );
        Case theCase = new Case("200", "Lenovo", "240V", dimensions);

        Resolution theResolution = new Resolution(1920, 1200);
        Monitor theMonitor = new Monitor("27 inch", "Dell", 1000, theResolution);

        Motherboard motherboard = new Motherboard("TheBestBlader", "Asus", 4, 4, "UEFI");

        PC thePC = new PC(theCase, theMonitor, motherboard);
        thePC.powerUP();

    }
}
