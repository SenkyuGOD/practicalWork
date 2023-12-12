package edu.training.independent_work.task2;

public class Task2 {
    public static void main(String[] args) {
        int n = 10;
        double a = 0.50;
        double b = 1.00;

        System.out.println("Number\tArgument\tf(x)");

        double step = (b - a) / n;
        for (int i = 0; i < n; i++) {
            double x = a + i * step;
            double result = f(x);
            System.out.printf("%d\t%.6f\t%.6f\n", i + 1, x, result);
        }
    }

    public static double f(double x) {
        double E = Math.E;
        double PI = Math.PI;

        double firstPart = Math.sqrt(Math.pow(E, 2.2 * x));

        double secondPart = Math.abs(Math.sin((PI * x) / (x + (2.0 / 3.0))));

        double thirdPart = 1.7;

        double result = firstPart - secondPart + thirdPart;
        return result;
    }
}
