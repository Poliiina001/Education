package Tasks;

public class TestEcxeption {
    public static void main(String[] args){
    int firstFigure = 10;
    int secondFigure = 0;
    String thirtFigure = "null";
    try {
        int c = firstFigure/secondFigure;
    } catch (ArithmeticException e){
        System.out.println("Делить на String - нельзя!");
    }
        System.out.println("Программа работает успешно!");
}}