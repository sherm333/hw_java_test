/**
 * Вывести все простые числа от 1 до 1000
 */

public class output_prime_numbers {
    public static void main(String[] args) {
        Boolean b = true;
        for (int i = 2; i < 1000; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    b = false;
                    break;
                }
            }
            if (b) System.out.println(i);  
            else b = true;
        }

    }
}
