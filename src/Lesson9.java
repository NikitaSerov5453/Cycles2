import java.util.Scanner;

public class Lesson9 {
    /**
     * Задание 9
     * Необходимо нарисовать ёлочку символом «звёздочка».
     * Каждый новый ярус должен быть шире предыдущего. С
     * клавиатуры вводится количество ярусов, и высота первого
     * (верхнего) яруса ёлочки (количество строк в ярусе). Ёлочка
     * должна быть симметричная.
     * Задание 6
     * Нарисовать на экране лесенку. Количество ступенек указывает пользователь с клавиатуры.
     * Пример лесенки на 3 ступеньки:
     * 4
     * Пример работы программы
     */

    public static void main(String[] args) {
        fir(scanner().nextInt(), scanner().nextInt());
    }

    public static void fir(int weight, int numberOfTiers) {
        int indent = weight+ numberOfTiers;
        for (int c = 0; c < numberOfTiers; c++) {
            for (int i = 0; i < weight; i++) {
                for (int j = i; j < indent; j++) { //левый отступ
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
            weight +=1;
        }
    }

    public static Scanner scanner() {
        return new Scanner(System.in);
    }
}
