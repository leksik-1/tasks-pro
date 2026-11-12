import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);                 // дробные числа вводим через точку

        System.out.print("Введите x (-1 < x < 1): ");
        double x = sc.nextDouble();
        System.out.print("Введите n: ");
        int n = sc.nextInt();
        System.out.print("Введите e: ");
        double e = sc.nextDouble();

        double a = 1;          // текущий член ряда, a0 = 1
        double sum1 = 0;       // сумма n слагаемых
        double sum2 = 0;       // сумма слагаемых, где |a| > e
        double sum3 = 0;       // сумма слагаемых, где |a| > e/10
        int k = 0;             // номер текущего члена

        while (k < n || Math.abs(a) > e / 10) {
            if (k < n) {
                sum1 += a;
            }
            if (Math.abs(a) > e) {
                sum2 += a;
            }
            if (Math.abs(a) > e / 10) {
                sum3 += a;
            }

            k++;                                  // переходим к следующему члену
            a = a * (-(k + 2.0) / k) * x;         // a_k = a_(k-1) * (-(k+2)/k) * x
        }

        double exact = 1 / Math.pow(1 + x, 3);    // значение через Math

        System.out.println("1) Сумма n слагаемых:        " + sum1);
        System.out.println("2) Сумма слагаемых |a| > e:    " + sum2);
        System.out.println("3) Сумма слагаемых |a| > e/10: " + sum3);
        System.out.println("4) Math:                       " + exact);
    }
}

