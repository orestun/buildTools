package com.epam;

import com.epam.Utils;

public class App {
    public static void main(String[] args) {
        System.out.println("\n==========PROGRAM==========");
        System.out.println("Result for method Utils.isPositiveNumber:");
        System.out.println(Utils.isPositiveNumber("45"));
        System.out.println("Result for method Utils.isAllPositiveNumber:");
        System.out.println(Utils.isAllPositiveNumbers("43","7","54"));
        System.out.println("===========================");
    }
}
