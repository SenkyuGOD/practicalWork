package edu.training.independent_work.task4;

import java.util.Random;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int count = 0;

        System.out.print(">");
        int n = sc.nextInt();


        for (int i = 0; i < n; i++) {
            int x = rand.nextInt(2 + 2) - 2;
            int y = rand.nextInt(2 + 2) - 2;
            System.out.println(x + ":" + y);


            boolean result = checkPointsINSquare(x, y);

            if (result){
                count++;
            }
        }
        System.out.println("Количество точек вошедших в заданную область: " + count);
    }

    public static boolean checkPointsINSquare(int x, int y) {

        if ((x >= -2 && x <= 0) && (y <= 2 && y >= 0)) {
            return true;
        }

        if ((x >= 0 && x <= 2) && (y >= -1 && y <= 1)) {
            return true;
        }
        return false;
    }
}
