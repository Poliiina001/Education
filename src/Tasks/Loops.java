package Tasks;

import java.util.Scanner;
//
//public class Loops {
//    private static boolean b1;
//
//    public static void main (String arg []) {
//        System.out.println("--Task 4.1--");
//        System.out.print("Enter the number");
//        Scanner inputNumber = new Scanner (System.in);
//        int a = inputNumber.nextInt();
//        if (a < 0) {
//            System.out.println("Error, please, print another number again");
//        }
//        else if {
//            for (int b = 0; b <= a; b++) {
//                b= b % 2 == 0 ) { System.out.println ("even number");}
////                else {
////                    boolean b2 = b % 3 == 0;
////                } {System.out.println( "multiple 3");}
//            }
//
////                    else (b % 3==0 ) {System.out.println( "multiple 3");}
////                   else {System.out.println ( b );}
//
////            }
//
//    }

class TaskLoops {

    public static void main(String arg[]) {
        System.out.println("--Task 4.1--");
        System.out.print("Enter the number");
        Scanner inputNumber = new Scanner(System.in);
        int a = inputNumber.nextInt();
        if (a < 0) {
            System.out.println("Error, please, print another number again");
            return;
        }
        for (int d = 1; d <= a; d++) {
            if (d % 3 == 0)
            {
                System.out.println("Divided on 3");
                continue;
            }
            else if (d % 2 == 0) {
                System.out.println("Even digits");
            }
            System.out.println(d);
        }
    }
}
