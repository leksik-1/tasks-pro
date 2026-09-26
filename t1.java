import java.util.Scanner;

public class t1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите v1: ");
        double v1 = sc.nextDouble();
        while (v1 < 0) {
            System.out.print("Объем не может быть отрицательным, повторите: ");
            v1 = sc.nextDouble();
        }

        System.out.print("Введите t1: ");
        double t1 = sc.nextDouble();

        System.out.print("Введите v2: ");
        double v2 = sc.nextDouble();
        while (v2 < 0) {
            System.out.print("Объем не может быть отрицательным, повторите: ");
            v2 = sc.nextDouble();
        }

        System.out.print("Введите t2: ");
        double t2 = sc.nextDouble();

        double v = v1 + v2;
        double t = (v1 * t1 + v2 * t2) / v;

        System.out.printf("\nОбъем смеси: %.1f л\n", v);
        System.out.printf("Температура смеси: %.1f °C\n", t);
    }
}
