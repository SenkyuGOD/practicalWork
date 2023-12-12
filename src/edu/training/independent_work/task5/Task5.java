package edu.training.independent_work.task5;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        double A = 1.0;

        double x1 = -2.0 * A;

        double dX = A / 5.0;

        result(A, x1, dX, n);

    }

    public static void result(double A, double x1, double dX, int n) {
        double X = x1;
        double E = Math.E;

        for (int i = 1; i <= n; i++) {
            if (X <= 0) {
                double Y = (A / 2) * ((Math.pow(E, (X / A))) + Math.pow(E, (-X / A)));
                System.out.println("X = " + X + ", Y = " + Y);
            } else {
                double Y = (4 * Math.pow(A, 3)) / ((Math.pow(X, 2)) + (4 * Math.pow(A, 4)));
                System.out.println("X = " + X + ", Y = " + Y);
            }
            X +=dX;
        }
    }
}
