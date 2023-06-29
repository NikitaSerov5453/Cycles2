import java.util.Scanner;

public class Lesson3 {
    /**
     * Задание 3
     * Равнобедренный треугольник:
     * заполненный и пустой.
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        isoscelesTriangle(scanner.nextInt());
        System.out.println();
        isoscelesTriangleEmpty(scanner.nextInt());
    }

    public static void isoscelesTriangle(int weight) {
        for (int i = 0; i < weight; i++) {
            for (int j = i; j < weight; j++) { //левый отступ
                System.out.print(" ");
            }
            for (int j = -i; j < 1; j++){ // левая половина
                System.out.print("*");
            }
            for (int j = -i; j < 0; j++) { // правая половина
                System.out.print("*");
            }
            System.out.print("\n");
        }

    }

    public static void isoscelesTriangleEmpty(int weight) {
        for (int i = 0; i < weight; i++) {
            for (int j = i; j < weight; j++) { //левый отступ
                System.out.print(" ");
            }

            for (int j = -i; j < 1; j++){ //левая внешняя сторона
                System.out.print("*");
                for (int k = -i + 1; k < 0; k++) { //внутренняя часть левой стороны
                    if (i == weight-1) {
                        break;
                    } else {
                        System.out.print(" ");
                    }
                }

                if (i != weight-1) {
                    break;
                }
            }
            for (int j = i; j < weight; j++){

                for (int k = -i; k < 0; k++) { // внутренняя часть правой стороны
                    if (i == weight-1) {
                        break;
                    } else {
                        System.out.print(" ");
                    }
                }
                for (int l = -i; l < 0; l++){
                    if (i < weight-1) {
                        System.out.print("*"); // правая внешняя сторона
                        break;
                    } else {
                        System.out.print("*"); // правая нижняя сторона
                    }

                }
                if (i != weight-1) {
                    break;
                }

            }
            System.out.print("\n");
        }
    }
}
