package lab04;

public class Task35 {
    public static void main(String[] args) {
        // Перевірка різних наборів даних
        printResult(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12});
        printResult(new int[]{0, -1, -2, -3, -4, -5, -6, -7});
        printResult(new int[]{1, 2, 3}); // замалий масив
        printResult(null);                // тест на NullPointerException
    }

    // Метод для знаходження суми елементів з індексами у діапазоні [5;10]
    public static int calculateRangeSum(int[] arr) {
        if (arr == null) {
            throw new NullPointerException("Масив не може бути null!");
        }
        if (arr.length <= 5) {
            throw new IndexOutOfBoundsException("Масив занадто короткий! Потрібно принаймні 11 елементів (індекси 0–10).");
        }

        int sum = 0;
        int start = 5;
        int end = Math.min(10, arr.length - 1); // якщо масив коротший за 11 елементів, беремо максимум можливого

        for (int i = start; i <= end; i++) {
            sum += arr[i];
        }

        return sum;
    }

    // Метод для друку результатів
    private static void printResult(int[] arr) {
        try {
            int result = calculateRangeSum(arr);
            System.out.println("Сума елементів з індексами [5;10]: " + result);
        } catch (Exception e) {
            System.out.println("Помилка: " + e.getMessage());
        }
    }
}
