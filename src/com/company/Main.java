package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so luong so nguyen to duoc in ra vao day ");
        int num = sc.nextInt();
        int count = 0;
        int n = 2;
        while (count < num) {
            boolean isPrime = true;
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    isPrime = false;
                }
            }
            if (isPrime) {
                System.out.println(n);
                count++;
            }
            n++;
        }
    }
}
