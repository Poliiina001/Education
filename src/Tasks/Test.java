package Tasks;

import java.util.*;
import java.lang.*;

public class Test {
    public static void main(String[] args) {
        System.out.println("--Task 4.3--");
        int a;
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number");
        if (scn.hasNextInt()) {  //Если проверка пройдена, перемменой а присваивается значение введенного числа
            a = scn.nextInt(); //Из условия задачи нам необходимо найти все делители числа, заданного пользователем. Зная, что наибольший делитель - это само число, а наименьший - 1, составим цикл: если при деление по модулю заданного числа на число из потенциальных делителей результат равен 0, такое число является делителем заданного числа, которое и выводим на экран
            System.out.print("The largest integer divisor of " + a + " is ");
            for (int i = a - 1; i > 0; i--) {
                if (a % i == 0) {
                    System.out.print(i);
                    break;
//                      {
////                      System.out.print(i[1]);
//               }
                }
            }
        } else System.out.println("Error, please, enter other number");

    }
}