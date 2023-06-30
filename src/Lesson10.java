import java.util.Scanner;

public class Lesson10 {
    /**
     * Задание 10
     * Напишите программу, которая будет считывать с консоли любое число (от 0 до 99999999) и выводить его цифры в
     * виде «звёздочек» (см. рисунок).
     * Пример для числа 41072819
     */

    public static void main(String[] args) {
        numberDefinition(num);
        pseudoGraphics();
    }

    public static int num = scanner().nextInt();

    public static Integer[] numbers = new Integer[numberLength(num)];

    public static String[] zero = new String[]{
            "  ***  ",
            " *   * ",
            "*     *",
            "*     *",
            "*     *",
            " *   * ",
            "  ***  ",
    };

    public static String[] one = new String[]{
            "   *   ",
            "  **   ",
            "   *   ",
            "   *   ",
            "   *   ",
            "   *   ",
            "  ***  ",
    };

    public static String[] two = new String[]{
            "  ***  ",
            " *   * ",
            " *   * ",
            "   **  ",
            "  *    ",
            " *     ",
            " ***** ",
    };

    public static String[] three = new String[]{
            "  ***  ",
            " *   * ",
            "     * ",
            "   **  ",
            "     * ",
            " *   * ",
            "  ***  ",
    };

    public static String[] four = new String[]{
            "    *  ",
            "   **  ",
            "  * *  ",
            " *  *  ",
            " ******",
            "    *  ",
            "    *  ",
    };

    public static String[] five = new String[]{
            " ***** ",
            " *     ",
            " *     ",
            "  ***  ",
            "     * ",
            " *   * ",
            "  ***  ",
    };

    public static String[] six = new String[]{
            "  ***  ",
            " *   * ",
            " *     ",
            " ****  ",
            " *   * ",
            " *   * ",
            "  ***  ",
    };

    public static String[] seven = new String[]{
            " ***** ",
            "     * ",
            "    *  ",
            "   *   ",
            "  *    ",
            " *     ",
            " *     ",
    };

    public static String[] eight = new String[]{
            "  ***  ",
            " *   * ",
            " *   * ",
            "  ***  ",
            " *   * ",
            " *   * ",
            "  ***  ",
    };

    public static String[] nine = new String[]{
            "  ***  ",
            " *   * ",
            " *   * ",
            "  **** ",
            "     * ",
            " *   * ",
            "  ***  ",
    };

    public static int numberLength(int number) {
        return String.valueOf(number).length();
    }

    public static Scanner scanner() {
        return new Scanner(System.in);
    }

    public static void numberDefinition(int number) {
        for (int i = String.valueOf(number).length() - 1; i >= 0; i--) {
            numbers[i] = number % 10;
            number = number / 10;
        }
    }

    public static void pseudoGraphics() {
        for (int i = 0; i < 7; i++) {
            for (Integer number : numbers) {
                if (number == 0) {
                    System.out.print(zero[i]);
                } else if (number == 1) {
                    System.out.print(one[i]);
                } else if (number == 2) {
                    System.out.print(two[i]);
                } else if (number == 3) {
                    System.out.print(three[i]);
                } else if (number == 4) {
                    System.out.print(four[i]);
                } else if (number == 5) {
                    System.out.print(five[i]);
                } else if (number == 6) {
                    System.out.print(six[i]);
                } else if (number == 7) {
                    System.out.print(seven[i]);
                } else if (number == 8) {
                    System.out.print(eight[i]);
                } else if (number == 9) {
                    System.out.print(nine[i]);
                } else {
                    break;
                }
            }
            System.out.print("\n");
        }
    }

}
