package com.jfblg.packagechallenge;

import com.jfblg.packagetobeimported.series.Series;

public class Main {

    public static void main(String[] args) {
        System.out.println("nSum: " + Series.nSum(10));

        for (int i = 0; i <= 10; i++) {
            System.out.println(Series.nSum(i));
        }
        System.out.println("----");
        for (int i = 0; i <= 10; i++) {
            System.out.println(Series.factorial(i));
        }
        System.out.println("----");
        for (int i = 0; i <= 10; i++) {
            System.out.println(Series.fibonacci(i));
        }
    }
}
