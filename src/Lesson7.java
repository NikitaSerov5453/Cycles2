import java.util.Scanner;

public class Lesson7 {
    /**
     * Задание 7
     * С клавиатуры вводится целое положительное число любой разрядности. Необходимо перевернуть это число, т. е.
     * цифры должны располагаться в обратном порядке (например, вводим число 1234 – в результате будет 4321).
     * Не использовать строки и массивы
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(revers(scanner.nextInt()));
    }

    public static int revers(int n) {
        int res = 0;
        while (n != 0) {
            int a = n % 10;
            res = (res * 10) + a;
            n = n / 10;
        }
        return res;
    }
}
