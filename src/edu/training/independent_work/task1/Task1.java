package edu.training.independent_work.task1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double x = sc.nextDouble();

        double E = Math.E;
        double PI = Math.PI;

        double firstPart = Math.sqrt(Math.pow(E, 2.2 * x));

        double secondPart = Math.abs(Math.sin((PI * x) / (x + (2.0 / 3.0))));

        double thirdPart = 1.7;

        double result = firstPart - secondPart + thirdPart;

        System.out.println(result);
    }
}
