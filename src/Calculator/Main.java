package Calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double A;
        double B;
        double answer;
        char oper;
        Scanner reader = new Scanner(System.in);
        System.out.println("Введите два числа: ");
        A = reader.nextDouble();
        B = reader.nextDouble();

        System.out.print("\nВведите операцию (+, -, *, ,): ");
        oper = reader.next().charAt(0);

        switch (oper) {
            case '+': answer = A + B;
                break;
            case '-': answer = A - B;
                break;
            case '*': answer = A * B;
                break;
            case '/': answer = A / B;
                break;
            default:
                System.out.println("Не знаю такой операции!");
                return;
        }
        System.out.println("Результат: ");
        System.out.print(A + " " + oper + " " + B + " = " + answer);
    }

}