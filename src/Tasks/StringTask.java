package Tasks;

import java.util.Scanner;
import java.lang.String;

public class StringTask {
    public static void main(String[] args) {
        System.out.println("--Task 6.1--");
        System.out.println("Enter the some words");
        Scanner inputNumber = new Scanner(System.in);
        String phrase = inputNumber.nextLine();
        char[] result= phrase.replaceAll(" ", "").toUpperCase().toCharArray();
        for (char c : result)
            System.out.println(c);
    }
}

class StringTask62 {
    public static void main(String[] args) {
        System.out.println("--Task 6.2--");
        System.out.println("Enter the sentenсe");
        Scanner inputNumber = new Scanner(System.in);
        String phrase = inputNumber.nextLine();
        int index1 = phrase.indexOf("java");
        if (index1 >= 0) {
            char[] result = phrase.toCharArray();
            for (int i = result.length - 1; i >= 0; i--)
                System.out.print(result[i]);
        } else {
            String[] resultArr = phrase.split(" ");
            for (String word : resultArr) {
                System.out.print(word.substring(0, 1).toUpperCase() + word.substring(1, word.length()) + " ");

            }
        }
    }
}


class StringTask63 {
    public static void main(String[] args) {
        System.out.println("--Task 6.3--");
        System.out.println("Enter the sentenсe");
        Scanner inputNumber = new Scanner(System.in);
        String phrase = inputNumber.nextLine();
        String someChar = inputNumber.nextLine();
       //char[] someCharN = someChar.toCharArray();
        int count = 0;
        //for (int i = 0; i < phrase.length(); i++) {
        //    if (phrase.charAt(i) = String someChar()); {
         //       count++;
            }
        }
      //  System.out.print(count);
   // }
//}

class StringTask64 {
    public static void main(String[] args) {
        System.out.println("--Task 6.4--");
        System.out.println("Enter the sentenсe in PascalCase");
        Scanner inputNumber = new Scanner(System.in);
        String phrase = inputNumber.nextLine();
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < phrase.length(); i++) {
            Character ch = phrase.charAt(i);
            if (Character.isUpperCase(ch))
                result.append(" ").append(ch);

            else
                result.append(ch);
        }
        System.out.print(result);
    }
}
