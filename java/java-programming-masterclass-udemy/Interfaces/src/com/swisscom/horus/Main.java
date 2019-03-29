package com.swisscom.horus;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ITelephone ferosPhone = new DeskPhone(41775200);
        ferosPhone.powerOn();
        ferosPhone.callPhone(41775200);

        ferosPhone = new MobilePhone(12345);
//        ferosPhone.powerOn();
        ferosPhone.callPhone(12345);
        ferosPhone.answer();
    }
}
