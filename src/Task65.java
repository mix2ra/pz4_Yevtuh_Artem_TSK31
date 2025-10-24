package lab04;

import java.util.Arrays;

public class Task65 {
    public static void main(String[] args) {
        // Перевірка різних наборів даних
        printResult(new int[]{1, 2, 3, 4, 5});
        printResult(new int[]{10, -20, 30});
        printResult(new int[]{}); // порожній масив
        printResult(null);        // null
    }

    // Метод, що повертає новий масив у зворотному порядку
    public static int[] reverseArray(int[] arr) {
        if (arr == null) {
            throw new NullPointerException("Масив не може бути null!");
        }
        if (arr.length == 0) {
            throw new IllegalArgumentException("Масив порожній!");
        }

        int[] reversed = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            reversed[i] = arr[arr.length - 1 - i];
        }

        return reversed;
    }

    // Метод для демонстрації результатів
    private static void printResult(int[] arr) {
        try {
            int[] reversed = reverseArray(arr);
            System.out.println("Старий масив: " + Arrays.toString(arr));
            System.out.println("Новий масив:  " + Arrays.toString(reversed));
            System.out.println("----------------------");
        } catch (Exception e) {
            System.out.println("Помилка: " + e.getMessage());
            System.out.println("----------------------");
        }
    }
}
