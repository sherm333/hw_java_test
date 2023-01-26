// Реализовать простой калькулятор (пользователь вводит 2 числа и вводит операцию (+ - / *)
import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        while (true){
            System.out.println("Выберите операцию");
            System.out.println("1. Сложение");
            System.out.println("2. Вычитание");
            System.out.println("3. Умножение");
            System.out.println("4. Деление");
            System.out.println("5. Выход");
            int operation = iScanner.nextInt();
            int res;
            if (operation == 5) {
                break;  
            } else if (operation == 1) {
                System.out.println("Введите первое число: ");
                int a = iScanner.nextInt();
                System.out.println("Введите второе число: ");
                int b = iScanner.nextInt();
                System.out.println("a: " + a);
                System.out.println("b: " + b);
                res = a + b;
                System.out.println("Ответ: " + res);
            } else if (operation == 2) {
                System.out.println("Введите первое число: ");
                int a = iScanner.nextInt();
                System.out.println("Введите второе число: ");
                int b = iScanner.nextInt();
                System.out.println("a: " + a);
                System.out.println("b: " + b);
                res = a - b;
                System.out.println("Ответ: " + res);
            } else if (operation == 3) {
                System.out.println("Введите первое число: ");
                int a = iScanner.nextInt();
                System.out.println("Введите второе число: ");
                int b = iScanner.nextInt();
                System.out.println("a: " + a);
                System.out.println("b: " + b);
                res = a * b;
                System.out.println("Ответ: " + res);
            } else if (operation == 4) {
                System.out.println("Введите первое число: ");
                int a = iScanner.nextInt();
                System.out.println("Введите второе число: ");
                int b = iScanner.nextInt();
                if (b == 0) {
                    System.out.println("На ноль делить нельзя!");
                }

                System.out.println("a: " + a);
                System.out.println("b: " + b);
                res = a / b;
                System.out.println("Ответ: " + res);
        }    else {
            System.out.println("Ошибка!");
            }   
        }
    }
}