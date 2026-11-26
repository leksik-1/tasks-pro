import java.util.Locale;
import java.util.Scanner;

public class t3 {

    public static final circle C1 = new circle(-3, 6, 5);   // больш круг
    public static final circle C2 = new circle(4, 5, 3);   // мал круг

    public static final rectangle A = new rectangle(-2, -2, 0, 4);   // вертик желт-оранж прямоуг выше
    public static final rectangle B = new rectangle(-2, -4, 0, -2);   // вертик син прямоуг ниже
    public static final rectangle C = new rectangle(0, -2, 3, 0);   // горизонт оранж прямоуг
    public static final rectangle D = new rectangle(0, -6, 3, -2);   // горизонт син прямоуг
    public static final rectangle G = new rectangle(-6, -2, -2, 0);   // зел прямоуг

    public static color getColor(double x, double y) {
        if (C1.isPointInside(x, y)) {
            if (A.isPointInside(x, y)) {
                return color.YELLOW;
            }
            if (C2.isPointInside(x, y)) {
                return color.WHITE;   // пересеч двух кругов
            }
            return color.BLUE;
        }

        if (A.isPointInside(x, y)) {
            return color.ORANGE;
        }
        if (B.isPointInside(x, y)) {
            return color.BLUE;
        }
        if (C.isPointInside(x, y)) {
            return color.ORANGE;
        }
        if (D.isPointInside(x, y)) {
            return color.BLUE;
        }
        if (G.isPointInside(x, y)) {
            return color.GREEN;
        }
        return color.WHITE;
    }

    public static void printColorForPoint(double x, double y) {
        System.out.println("(" + x + ", " + y + ") -> " + getColor(x, y));
    }

    // тесты
    public static void main(String[] args) {
        printColorForPoint(-3, 8);      // больш круг -> BLUE
        printColorForPoint(-1, 3);      // круг + прямоуг A -> YELLOW
        printColorForPoint(-1, 0.5);    // прямоуг A вне круга -> ORANGE
        printColorForPoint(-4, -1);        // зел прямоуг -> GREEN
        printColorForPoint(8, -8);      // пустой фон -> WHITE
        printColorForPoint(5, 5);     // мал круг -> WHITE
        printColorForPoint(1.5, 5.5); // пересеч двух кругов -> WHITE

        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        System.out.print("Input X: ");
        double x = sc.nextDouble();
        System.out.print("Input Y: ");
        double y = sc.nextDouble();

        printColorForPoint(x, y);
    }
}