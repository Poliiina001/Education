package Tasks;


import java.sql.SQLOutput;
import java.lang.Math;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println("Hello\n\n\tworld\t!");

        byte num1 = 15;
        int num2 = 2134;
        float num3 = 4.45f;
        short num4 = 2345;
        String name = " Polina ";
        char symbl = '<';

        System.out.println(num1 + num3 + name + symbl + " " + "hello");
    }
}


class FirstStep {
    public static void main(String[] args) {
        System.out.println("--TASK_1.1--");
        int number1 = 26;
        short number2 = 123;
        byte number3 = 8;
        long number4 = 1234567890;
        float number5 = 1.2f;
        double number6 = -3.234;
        char symbol = '$';
        boolean yes = true;
        String goal = "be friendly with Java";
        System.out.println(number1);
        System.out.println(number2);
        System.out.println(number3);
        System.out.println(number4);
        System.out.println(number5);
        System.out.println(number6);
        System.out.println(symbol);
        System.out.println(yes);
        System.out.println(goal);

    /* float error2 = 123.2;
        System.out.println(error2);
     */
        System.out.println("--TASK_1.2--");
        number1 = number1 + number3;
        System.out.println(number1);
        number2 /= 123;
        System.out.println(number2);
        number2 += 11;
        System.out.println(number2);
        number2 -= 4;
        System.out.println(number2);
        number2 *= 4;
        System.out.println(number2);

//      final int test = 12;
//     test = 13;


        System.out.println("--TASK_2.1--");
        int a = 2;
        int b = 4;
        int c = 8;
        int p = (a + b + c) / 2;
        System.out.println(p);
        double S = p * (p - a) * (p - b) * (p - c);
        System.out.println(Math.sqrt(Math.abs(S))); //сначала привели к модулю значение потом вынесли с корня
    }
}

class Conditions {
    public static void main(String[] args) {
        System.out.println("--Task 3.1--");
        System.out.print("Введите любимое число");
        Scanner inputFigure = new Scanner(System.in);
        int i = inputFigure.nextInt();
//        if ((i >= 1 & i <= 10) | i<0) {
//            System.out.print("Ваше любимое число до 10 включительно");
//        } else if (i > 10) {
//            {
//                System.out.print("Ваше любимое число больше 10");
//            }
//        } else {
//            System.out.print("Ваше любимое число ноль");
//        }
        if (i == 0) {
            System.out.print("Ваше любимое число ноль");
        } else if (i >= 10) {
            System.out.print("Ваше любимое число до 10 включительно");
        } else
            System.out.print("Ваше любимое число меньше 10");


    }
}

class ScannerDouble {
    public static void main(String[] args) {
        System.out.println("--Task 3.2--");
        System.out.print("Введите число");
        Scanner inputNumber = new Scanner(System.in);
        double num = inputNumber.nextDouble();
        if (num % 2 == 0) {
            System.out.print("Вы ввели четное число");
        } else {
            System.out.print("Вы ввели нечетное число");
        }
    }
}

class FloatFiger {
    public static void main(String[] args) {
        System.out.println("--Task 3.3--");
        System.out.print("Введите число");
        Scanner inputNumber = new Scanner(System.in);
        float num = inputNumber.nextFloat();
        if ((num % 2 == 0 && num >= 10) || (num == 15)) {
            System.out.print("Ваше число подходит под наши условия");
        } else {
            System.out.print("К сожалению, нам не по пути");
        }
    }}

class NewTask {
        public static int countBits(int n){
            Scanner inputNumber = new Scanner(System.in);
            int i = inputNumber.nextInt();
            int c = Integer.bitCount(i);
            return c;
            // Show me the code!
        }
    }
