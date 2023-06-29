import java.util.Scanner;

public class Lesson2 {
    /**
     * Задание 2
     * Прямоугольный треугольник,
     * прямым углом вверх-вправо:
     * заполненный и пустой.
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        rightTriangle(scanner.nextInt());
        System.out.println();
        rightTriangleGape(scanner.nextInt());
    }

    public static void rightTriangle(int weight) {
        for (int i = 0; i < weight; i++) {
            for (int j = -i; j < 1; j++) { //отступ
                System.out.print(" ");
            }
            for (int j = i; j < weight; j++){ //тело
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }

    public static void rightTriangleGape(int weight) {
        for (int i = 0; i < weight; i++) {
            for (int j = -i; j < 1; j++) { //отступ
                System.out.print(" ");
            }

            for (int j = i; j < weight-1; j++){ //левая и верхние стороны
                System.out.print("*");
                for (int k = i; k < weight-2; k++) { //тело
                    if (i == 0) {
                        break;
                    } else {
                        System.out.print(" ");
                    }
                }
                if (i != 0) {
                    break;
                }

            }
            System.out.print("*\n"); //правая сторона
        }
    }
}
