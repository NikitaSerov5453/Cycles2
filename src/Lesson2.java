public class Lesson2 {
    /**
     * Задание 2
     * Прямоугольный треугольник,
     * прямым углом вверх-вправо:
     * заполненный и пустой.
     */

    public static void main(String[] args) {
        rightTriangle();
        System.out.println();
        rightTriangleGape();
    }

    public static void rightTriangle() {
        for (int i = 0; i < 8; i++) {
            for (int j = -i; j < 1; j++) { //отступ
                System.out.print(" ");
            }
            for (int j = i; j < 8; j++){ //тело
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }

    public static void rightTriangleGape() {
        for (int i = 0; i < 8; i++) {
            for (int j = -i; j < 1; j++) { //отступ
                System.out.print(" ");
            }

            for (int j = i; j < 7; j++){ //левая и верхние стороны
                System.out.print("*");
                for (int k = i; k < 6; k++) { //тело
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
