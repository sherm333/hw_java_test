import java.util.Scanner;

/**
 * Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
 */
public class triangular {
    public static void main(String[] args) {
        try (Scanner iScanner = new Scanner(System.in)) 
            {
                System.out.print("Введите число: ");
                int number = iScanner.nextInt();
                int summ = 0;
                int fact = 1;
                for (int i = 1; i < number; i++) {
                    summ += i;
                    fact *= i;
                }
                System.out.println("Треугольное число: " + summ);
                System.out.println("Факториал числа: " + fact);
            }
        }
}