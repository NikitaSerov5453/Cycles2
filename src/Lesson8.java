import java.util.Scanner;

public class Lesson8 {
    /**
     * Задание 8
     * С клавиатуры вводится целое число любой разрядности.
     * Программа должна определить и вывести на консоль количество цифр в этом числе, а так же сумму этих чисел
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        numbers(scanner.nextInt());
    }

    public static void numbers(int n) {
        int length = String.valueOf(n).length();
        int sum = 0;
        int a;
        for (int i = 0; i < length; i++) {
            a = n % 10;
            sum += a;
            n = n / 10;
        }
        System.out.println("Длина числа: " + length);
        System.out.println("Сумма чисел: " + sum);
    }
}
