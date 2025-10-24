package lab04;

public class Task5 {
    public static void main(String[] args) {
        // Перевірка різних наборів даних
        printResult(new int[]{1, -2, 3, -4, 5});
        printResult(new int[]{0, 2, 4, 6});      // без від’ємних
        printResult(new int[]{});                 // порожній масив
        printResult(null);                        // тест на NullPointerException
    }

    // Метод, що обчислює суму від’ємних елементів
    public static int calculateNegativeSum(int[] arr) {
        if (arr == null) {
            throw new NullPointerException("Масив не може бути null!");
        }
        if (arr.length == 0) {
            throw new IllegalArgumentException("Масив порожній!");
        }

        int sum = 0;
        for (int num : arr) { // цикл for-each
            if (num < 0) {
                sum += num;
            }
        }
        return sum;
    }

    // Метод для виведення результатів
    private static void printResult(int[] arr) {
        try {
            int result = calculateNegativeSum(arr);
            System.out.println("Сума від’ємних елементів: " + result);
        } catch (Exception e) {
            System.out.println("Помилка: " + e.getMessage());
        }
    }
}
