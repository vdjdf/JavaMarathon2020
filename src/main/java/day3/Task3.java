package day3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
int i = 0 ;
        for(i = 0; i<5;i++){
            double a = scanner.nextDouble();
            double b = scanner.nextDouble();
            if (b == 0 ) {
                System.out.print("Деление на 0"+ "\n");
                --i;
                continue;
            }
            System.out.print(a / b + "\n");




        }
    }
}
