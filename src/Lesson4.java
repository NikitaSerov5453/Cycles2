public class Lesson4 {
    /**
     * Задание 4
     * Ромб: заполненный и пустой
     */

    public static void main(String[] args) {
        rhombus();
        System.out.println();
        rhombusEmpty();
    }

    public static void rhombus() {
        for (int i = 0; i < 8; i++) {
            for (int j = i; j < 8; j++) { //левый верхний отступ
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
        for (int i = 0; i < 7; i++) {
            for (int j = -i; j < 2; j++) { //левый нижний отступ
                System.out.print(" ");
            }
            for (int j = i; j < 7; j++) { //левая нижняя сторона
                System.out.print("*");
            }
            for (int j = i; j < 6; j++) { //правая нижняя сторона
                System.out.print("*");
            }
            System.out.print("\n");
        }

    }

    public static void rhombusEmpty() {
        for (int i = 0; i < 8; i++) {
            for (int j = i; j < 8; j++) { //левый верхний отступ
                System.out.print(" ");
            }

            for (; true; ) { //левая верхняя сторона
                System.out.print("*");
                for (int k = -i + 1; k < 0; k++) { //левая верхняя внутренняя часть
                    System.out.print(" ");
                }
                break;
            }
            for (int j = i; j < 8; j++) { // правая внутренняя часть

                for (int k = -i; k < 0; k++) {
                    System.out.print(" ");
                }
                for (int l = -i; l < 0; ) { // правая внешняя сторона
                    System.out.print("*");
                    break;

                }
                if (i != 7) {
                    break;
                }

            }
            System.out.print("\n");
        }
        for (int i = 0; i < 9; i++) {
            for (int j = -i; j < 0; j++) { //левый нижный отступ
                System.out.print(" ");
            }

            for (; true; ) { //левая нижняя сторона
                System.out.print("*");
                for (int k = i + 1; k < 8; k++) { //левая нижняя внутренняя часть
                    System.out.print(" ");
                }
                break;
            }
            for (int j = i; j < 8; ) {

                for (int k = i; k < 8; k++) { //правая нижняя внутренняя часть
                    System.out.print(" ");
                }
                for (; true; ) {
                    System.out.print("*"); //правая нижняя сторона
                    break;

                }
                break;

            }
            System.out.print("\n");
        }
    }
}
