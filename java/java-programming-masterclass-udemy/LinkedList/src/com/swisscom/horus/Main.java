package com.swisscom.horus;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Customer customer = new Customer("Fero", 1000.0);
        Customer anotherCustomer;
        anotherCustomer = customer;
        anotherCustomer.setBalance(20000.0);
        System.out.println("name: " + customer.getName() + " Balance: " + customer.getBalance());

        ArrayList<Integer> intList = new ArrayList<Integer>();

        intList.add(1);
        intList.add(2);
        intList.add(3);
        intList.add(4);
        for(int i=0; i < intList.size(); i++) {
            System.out.println(i + " : " + intList.get(i));
        }
        intList.add(1, 6);

        for(int i=0; i < intList.size(); i++) {
            System.out.println(i + " : " + intList.get(i));
        }


    }
}
