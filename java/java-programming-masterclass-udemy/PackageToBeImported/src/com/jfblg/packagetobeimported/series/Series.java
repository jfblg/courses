package com.jfblg.packagetobeimported.series;

public class Series {

    /**
     * Returns the sum of all members from 0 to 10, where the first 10 members are:
     * 0, 1, 3, 6, 10, 15, 21, 28, 36, 45, 55
     * @param n specifies count of members to be summed
     * @return sum of n members
     */
    public static int nSum(int n) {
        int[] members = {0, 1, 3, 6, 10, 15, 21, 28, 36, 45, 55, 100};
        int sum = 0;
        for(int i = 0; i < n; i++) {
                sum += members[i];
        }
        return sum;
    }

    public static int factorial(int n) {
        int product = 1;
        for(int i = 1; i <= n; i++) {
            product += product * i;
        }
        return product;
    }

    public static int fibonacci(int n) {
        int sum = 0;
        int nM1 = 1;
        int nM2 = 0;

        if(n == 0) {
            return 0;
        }
        if(n == 1) {
            return 1;
        }
        for(int i = 0; i < n-1; i++) {
            sum = nM1 + nM2;
            nM2 = nM1;
            nM1 = sum;
        }
        return sum;
    }
}
