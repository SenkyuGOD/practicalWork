package edu.training.independent_work.task8;

public class Task8 {
    public static void main(String[] args) {

        double x = 0.1;
        double difference = 0.1;
        double limit = 10.0;
        double E = Math.E;

        while (x <= limit) {
            double result = Math.pow(x, 2) - Math.pow(E, 2 * x) + 4;
            System.out.println("f(" + x + ") = " + result);

            if (Math.abs(result) < 1e-6) {
                System.out.println("Найден ноль функции: f(" + x + ") = " + result);
                break;
            }

            x += difference;
        }
    }
}



