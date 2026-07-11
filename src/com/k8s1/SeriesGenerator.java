package com.k8s1;
import java.util.Scanner;

public class SeriesGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int q = scanner.nextInt();

        for (int i = 0; i < q; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int n = scanner.nextInt();

            generateSeries(a, b, n);
        }

        scanner.close();
    }

    private static void generateSeries(int a, int b, int n) {
        int term = a;
        int powerOfTwo = 1;

        for (int i = 0; i < n; i++) {
            System.out.print(term + " ");
            term += powerOfTwo * b;
            powerOfTwo *= 2;
        }

        System.out.println();
    }
}
