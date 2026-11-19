import java.util.Scanner;

public class t7 {

    // кол-во инт убывания в массиве
    static int solution(int[] a) {
        int count = 0;

        for (int i = 0; i < a.length - 1; i++) {
            boolean goesDown = a[i] > a[i + 1];   // отсюда идёт спуск?
            boolean isStart = (i == 0) || (a[i - 1] <= a[i]);   // перед ним спуска нет?

            if (goesDown && isStart) {
                count++;   // нашли начало нового интервала
            }
        }

        return count;
    }

    // ввод массива 
    static int[] readArray(Scanner sc) {
        System.out.print("введите кол-во эл: ");
        int n = sc.nextInt();
        if (n < 0) {
            n = 0;
        }

        int[] a = new int[n];
        if (n > 0) {
            System.out.println("введите эл: ");
        }
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        return a;
    }

    // вывод массива в виде [1, 2, 3]
    static void printArray(int[] a) {
        System.out.print("[");
        for (int i = 0; i < a.length; i++) {
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(a[i]);
        }
        System.out.print("]");
    }

    public static void main(String[] args) {
        // Заранее заготовленные тесты
        int[][] tests = {
            {1, 3, -2, 11, 7, 3, 3, 2, 4, 2, 7, 12},  // пример из условия, ответ 4
            {},                                       // пустой массив, ответ 0
            {5},                                      // один элемент, ответ 0
            {5, 3},                                   // два элемента убывают, ответ 1
            {3, 5},                                   // два элемента возрастают, ответ 0
            {4, 4},                                   // два равных элемента, ответ 0
            {7, 7, 7, 7},                             // все равны, ответ 0
            {9, 7, 5, 3, 1},                          // весь массив убывает, ответ 1
            {1, 2, 3, 4, 5},                          // весь массив возрастает, ответ 0
            {5, 4, 6, 5, 7, 6},                       // три коротких спуска, ответ 3
            {3, 2, 2, 1},                             // равные числа разрывают спуск, ответ 2
            {-1, -5, -10, 0, -3}                      // отрицательные числа, ответ 2
        };

        System.out.println("=== автоматические тесты ===");
        for (int t = 0; t < tests.length; t++) {
            System.out.print("тест " + (t + 1) + ": ");
            printArray(tests[t]);
            System.out.println(" -> " + solution(tests[t]));
        }

        System.out.println();
        System.out.println("=== новый массив ===");
        Scanner sc = new Scanner(System.in);
        int[] user = readArray(sc);
        System.out.print("массив: ");
        printArray(user);
        System.out.println();
        System.out.println("кол-во интервалов убывания: " + solution(user));
    }
}