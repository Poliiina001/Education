package Tasks;

import java.util.Scanner;

public class ExtraTaskArray {
    public static void main(String[] args)
    {
        int[] my_array = {1, 2, 3, 4, 5, 3, 8, 9, 10, 11, 8, 15, 13, 8, 0};

        for (int i = 0; i < my_array.length-1; i++)
        {
            for (int j = i+1; j < my_array.length; j++)
            {
                if( (my_array[i]==(my_array[j])) && (i != j) )
                    System.out.print("Enter a number");
                Scanner inputNumber = new Scanner(System.in);
                int myNumber = inputNumber.nextInt();
                int k = myNumber;

                if (my_array[j] == myNumber);
//               {
//                    System.out.println(count.myNumber);
//                }
            }
        }
    }
}