package Tasks;

import java.util.Scanner;

public class Factorial {
    public static void main(String args[]) {
        System.out.println("--Task 4.2--");
        System.out.print("Enter the number");
        Scanner inputNumber = new Scanner(System.in);
        int a = inputNumber.nextInt();
        int result = 1;
        for (int i = a; i <= a; i--) {
            result = result * i;
        }
        System.out.println(result);
    }
}