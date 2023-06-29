import java.util.Scanner;

public class Lesson1 {
    /**
     * В заданиях с 1-го по 5-е, используя операторы ветвления и
     * цикла написать программу, алгоритм которой будет выводить геометрические фигуры в консоль в виде «звёздочек»
     * (псевдографика). Грани фигур должны быть ровными, фигуры – симметричными. Высота каждой фигуры должны
     * задаваться с клавиатуры. Можно использовать вывод только
     * одной «звёздочки» в System.out.print(“*”).
     * <p>
     * Прямоугольный треугольник,
     * прямым углом вниз-вправо:
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
            for (int j = i; j < weight; j++) { //отступ
                System.out.print(" ");
            }
            for (int j = -i; j < 1; j++){
                System.out.print("*"); //тело
            }
            System.out.print("\n");
        }
    }

    public static void rightTriangleGape(int weight) {
        for (int i = 0; i < weight; i++) {
            for (int j = i; j < weight; j++) { //отступ
                System.out.print(" ");
            }

            for (int j = -i; j < 0; j++){ //левая и нижняя части
                System.out.print("*");
                for (int k = -i + 1; k < 0; k++) {
                    if (i == weight-1) {
                        break;
                    } else {
                        System.out.print(" "); //внутренняя часть
                    }
                }
                if (i != weight-1) {
                    break;
                }

            }
            System.out.print("*\n"); // правая сторона
        }
    }
}
