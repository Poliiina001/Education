package Tasks;

import java.util.*;
import java.lang.*;

public class BirthDay {
    public static void main(String[] args) {
        System.out.println("--Task 4.3--");
        System.out.print("Enter your age");
        Scanner inputNumber = new Scanner(System.in);
        int a = inputNumber.nextInt();
        while ((a < 0) || (a >=140)) {
            System.out.println("Error, please, enter your real age");
            a = inputNumber.nextInt();
        }
        System.out.println("Your age is " + a +".");
    }
}