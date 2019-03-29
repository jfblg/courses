package com.swisscom.horus;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String[] strArray = new String[10];
        int[] intArray = new int[10];

        ArrayList<String> strArrayList = new ArrayList<String>();
        strArrayList.add("Fero");

//        ArrayList<int> intArrayList = new ArrayList<int>();
        ArrayList<IntClass> intArrayList = new ArrayList<IntClass>();
        intArrayList.add(new IntClass(1));

        // Java wrapper classes:
//        Integer integerValue = new Integer(10);
//        Double doubleValue = new Double(10.0);

        ArrayList<Integer> intArrayList2 = new ArrayList<Integer>();
        for(int i=0; i < 10; i++) {
            intArrayList2.add(Integer.valueOf(10 + i)); // this is called boxing. Wrapping a primitive type into an object
        }

        for(int i=0; i < 10; i++) {
            System.out.println(i + " ---> " + intArrayList2.get(i).intValue()); // this is called unboxing. Turing an object value into a primitive type
        }


        Integer myIntValue = 430; // this is a shortcut to create a boxed int value // java does this: Integer.valueOf(430)
        int myInt = myIntValue; // java does in backgroud: myIntValue.intValue();

        System.out.println("-------------------");

        ArrayList<Double> doubleArrayList = new ArrayList<Double>();

        for(double dbl=0.0; dbl < 10.0; dbl += 0.5) {
            doubleArrayList.add(Double.valueOf(dbl));
        }

        for(int i=0; i < doubleArrayList.size(); i++) {
            System.out.println(i + " >>>> " + doubleArrayList.get(i).doubleValue());
        }

    }
}
