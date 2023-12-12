package edu.training.independent_work.task3;

public class Task3 {
    public static void main(String[] args) {
        double PI = Math.PI;
        double E = Math.E;
        double x = 0.5;
        double n = 20;

        double firstPart = 0;

        double secondPart = Math.sqrt(n * PI);

        for (int i = 1; i <= n; i++) {
            firstPart += ((Math.sin((i * x) / 2.0)) + Math.sin((i * x - 1) / 2.0)) / Math.pow(E, (x - 1) / i);
        }

        double result = secondPart * firstPart;

        System.out.println(result);
    }
}
