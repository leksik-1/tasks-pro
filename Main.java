import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);   // дроби чз точку

        System.out.print("Введите x (-1 < x < 1): ");
        double x = sc.nextDouble();
        System.out.print("Введите n: ");
        int n = sc.nextInt();
        System.out.print("Введите e: ");
        double e = sc.nextDouble();

        double a = 1;   // текущ чл ряда
        double sum1 = 0;   // сумм n слагаемых
        double sum2 = 0;   // сумм слагаемых |a| > e
        double sum3 = 0;   // сумм слагаемых |a| > e/10
        int k = 0;   // номер текущ чл

        while (k < n || Math.abs(a) > e / 10) {   // ес нужно добрать n чл или текущ все еще больш
            if (k < n) {
                sum1 += a;
            }
            if (Math.abs(a) > e) {
                sum2 += a;
            }
            if (Math.abs(a) > e / 10) {
                sum3 += a;
            }

            k++;   // след чл
            a = a * (-(k + 2.0) / k) * x;   // рекуррентная ф-ла: a_k = a_(k-1) * (-(k+2)/k) * x
            // a_k / a_k-1 = (((-1)**n) * ((n+1)(n+2))/2 * (x**n)) / (((-1)**n-1) * (n(n+1)/2) * (x**n-1))
        }

        double exact = 1 / Math.pow(1 + x, 3);    // a**b

        System.out.println("1) Сумм n слагаемых: " + sum1);
        System.out.println("2) Сумм слагаемых |a| > e: " + sum2);
        System.out.println("3) Сумм слагаемых |a| > e/10: " + sum3);
        System.out.println("4) Знач ф-ции: " + exact);
    }
}

