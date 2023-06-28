public class Lesson3 {
    /**
     * Задание 3
     * Равнобедренный треугольник:
     * заполненный и пустой.
     */

    public static void main(String[] args) {
        isoscelesTriangle();
        System.out.println();
        isoscelesTriangleEmpty();
    }

    public static void isoscelesTriangle() {
        for (int i = 0; i < 8; i++) {
            for (int j = i; j < 8; j++) { //левый отступ
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

    public static void isoscelesTriangleEmpty() {
        for (int i = 0; i < 8; i++) {
            for (int j = i; j < 8; j++) { //левый отступ
                System.out.print(" ");
            }

            for (int j = -i; j < 1; j++){ //левая внешняя сторона
                System.out.print("*");
                for (int k = -i + 1; k < 0; k++) { //внутренняя часть левой стороны
                    if (i == 7) {
                        break;
                    } else {
                        System.out.print(" ");
                    }
                }

                if (i != 7) {
                    break;
                }
            }
            for (int j = i; j < 8; j++){

                for (int k = -i + 1; k < 0; k++) { // внутренняя часть правой стороны
                    if (i == 7) {
                        break;
                    } else {
                        System.out.print(" ");
                    }
                }
                for (int l = -i; l < 0; l++){
                    if (i < 7) {
                        System.out.print(" *"); // правая внешняя сторона
                        break;
                    } else {
                        System.out.print("*"); // правая нижняя сторона
                    }

                }
                if (i != 7) {
                    break;
                }

            }
            System.out.print("\n");
        }
    }
}
