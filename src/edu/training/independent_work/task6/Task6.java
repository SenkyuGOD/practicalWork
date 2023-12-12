package edu.training.independent_work.task6;

public class Task6 {
    public static void main(String[] args) {
        double A = 3 * Math.pow(10, 3);
        double B = 6 * Math.pow(10, 4);
        double M = 4;
        int count = 0;

        double t1 = Math.sqrt(A + B + M);
        double t2 = M * Math.sqrt(A + B);
        double t3 = Math.sqrt(A * B * M);
        double t4 = M * Math.sqrt(A * B);

        for (int k = -30; k <= 60; k++) {
            double f = (Math.pow(k, 3) - 25 * Math.pow(k, 2) + 50 * k + 1000);

            if (f >= t1 && f <= t2 || f >= t3 && f <= t4) {
                System.out.println("f(" + k + ") = " + f);
            } else count++;
        }
        System.out.println("Количество значений, не удовлетворяющих условию: " + count);
    }
}
