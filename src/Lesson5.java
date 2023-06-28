public class Lesson5 {
    /**
     * Задание 5
     * Параллелограмм: заполненный и пустой.
     */

    public static void main(String[] args) {
        parallelogram();
        System.out.println();
        parallelogramEmpty();
    }

    public static void parallelogram() {
        for (int i = 0; i < 8; i++) {
            for (int j = i; j < 8; j++) { //отсутп
                System.out.print(" ");
            }
            for (int k = 0; k < 15; k++) { //ширина
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
    public static void parallelogramEmpty() {
        for (int i = 0; i < 8; i++) {
            for (int j = i; j < 8; j++) { //отступ
                System.out.print(" ");
            }
            while (true) {//левая сторона
                System.out.print("*");
                break;
            }

            for (int k = 0; k < 16; k++) { //центральная часть
                if (i > 0 & i != 7) {
                    System.out.print(" ");
                }

            }

            while (true) { //правая сторона
                System.out.print("*");
                break;
            }

            for (int k = 0; k < 2; k++) { //ширина
                for (int l = 0; l <8; l++) {
                    if (i > 0 & i != 7) {
                        System.out.print(" ");
                        break;
                    } else {
                        System.out.print("*");
                    }

                }

            }

            System.out.print("\n");
        }

    }

}
