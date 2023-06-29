import java.util.Scanner;

public class Lesson4 {
    /**
     * Задание 4
     * Ромб: заполненный и пустой
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        rhombus(scanner.nextInt());
        System.out.println();
        rhombusEmpty(scanner.nextInt());
    }

    public static void rhombus(int weight) {
        for (int i = 0; i < weight; i++) {
            for (int j = i; j < weight; j++) { //левый верхний отступ
                System.out.print(" ");
            }
            for (int j = -i; j < 1; j++) { //левая верхняя часть
                System.out.print("*");
            }
            for (int j = -i; j < 0; j++) { //верхняя правая часть
                System.out.print("*");
            }
            System.out.print("\n");
        }
        for (int i = 0; i < weight-1; i++) {
            for (int j = -i; j < 2; j++) { //левый нижний отступ
                System.out.print(" ");
            }
            for (int j = i; j < weight-1; j++) { //левая нижняя сторона
                System.out.print("*");
            }
            for (int j = i; j < weight-2; j++) { //правая нижняя сторона
                System.out.print("*");
            }
            System.out.print("\n");
        }

    }

    public static void rhombusEmpty(int weight) {
        for (int i = 0; i < weight; i++) {
            for (int j = i; j < weight; j++) { //левый верхний отступ
                System.out.print(" ");
            }

            for (; true; ) { //левая верхняя сторона
                System.out.print("*");
                for (int k = -i + 1; k < 0; k++) { //левая верхняя внутренняя часть
                    System.out.print(" ");
                }
                break;
            }
            for (int j = i; j < weight; j++) { // правая внутренняя часть

                for (int k = -i; k < 0; k++) {
                    System.out.print(" ");
                }
                for (int l = -i; l < 0; ) { // правая внешняя сторона
                    System.out.print("*");
                    break;

                }
                if (i != weight-1) {
                    break;
                }

            }
            System.out.print("\n");
        }
        for (int i = 0; i < weight+1; i++) {
            for (int j = -i; j < 0; j++) { //левый нижный отступ
                System.out.print(" ");
            }

            while (true) { //левая нижняя сторона
                System.out.print("*");
                for (int k = i + 1; k < weight; k++) { //левая нижняя внутренняя часть
                    System.out.print(" ");
                }
                break;
            }
            for (int j = i; j < weight; ) {

                for (int k = i; k < weight; k++) { //правая нижняя внутренняя часть
                    System.out.print(" ");
                }
                while (true) {
                    System.out.print("*"); //правая нижняя сторона
                    break;

                }
                break;

            }
            System.out.print("\n");
        }
    }
}
