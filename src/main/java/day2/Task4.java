package day2;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        if (x >= 5) {
            System.out.println((x * x - 10.0) / (x + 7.0));
        } else if (-3 < x && x < 5) {
            System.out.println((x + 3.0) * (x * x - 2.0));
        } else {
            System.out.println("420.0");
        }

    }
}
