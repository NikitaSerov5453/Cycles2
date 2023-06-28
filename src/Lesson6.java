import java.util.Scanner;

public class Lesson6 {
    /**
     * Задание 6
     * Нарисовать на экране лесенку. Количество ступенек указывает пользователь с клавиатуры.
     * Пример лесенки на 3 ступеньки:
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ladder(scanner.nextInt());
    }

    public static void ladder(int steps) {
        int counter = -3;
        for (int l = 0; l < steps; l++) { //колличество степеней
            counter += 3;
            for (int i = 0; i < 2; i++) { //высота ступени
                for (int i1 = 0; i1 < counter; i1++) {
                    while (true) {
                        System.out.print(" ");
                        break;
                    }
                }

                for (int j = 0; j < 2; j++) {
                    if (i < 1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.print("*\n");
            }
        }
    }
}
