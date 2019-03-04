package com.kodilla.euclidean;
import java.util.*;

public class EuclideanAlgorithm {

    public static void main(String[] args){

        int a = (int) (Math.random()*1000 +100);
        int b = (int) (Math.random()*100 +20);

        System.out.println(a + " " + b);

        while (a != b) {

            if (a > b) {
                a -= b;
            } else {
                b -= a;
            }

        }
        System.out.println("The largest common divisor is: " + a);
    }
}
