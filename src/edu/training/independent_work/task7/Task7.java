package edu.training.independent_work.task7;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print(">");
        int n = sc.nextInt();
        System.out.print(">");
        int m = sc.nextInt();


        double xStart = 1;
        double zStart = 1;

        double hX = 0.3;
        double hZ = 0.5;

        calculateResult(xStart, zStart, hX, hZ, n, m);
    }

    public static void calculateResult(double xStart, double zStart, double hX, double hZ, int n, int m) {
        double result = 0;
        double xMax = xStart + (n * hX);
        double zMax = zStart + (m * hZ);

        int maxSteps = Math.max(n, m);
        System.out.println("X\t\thX\t\tZ\t\thZ\t\tResult");
        for (int i = 1; i < maxSteps; i++) {
            double firstPart = Math.sqrt(Math.pow(xStart, 2) + Math.pow(zStart, 2));
            double secondPart = Math.log(zStart);
            double thirdPart = Math.abs(Math.log(zStart)) / Math.sqrt(Math.pow(xStart, 2) + Math.pow(zStart, 2) + 3.2);

            result = firstPart * secondPart + thirdPart;

            System.out.printf("%.2f\t%.2f\t%.2f\t%.2f\t%.2f\n", xStart, hX, zStart, hZ, result);

            if (xStart != xMax) {
                xStart += hX;
            } else {
                xStart = xMax;
            }

            if (zStart != zMax) {
                zStart += hZ;
            } else {
                zStart = zMax;
            }
        }

    }
}
