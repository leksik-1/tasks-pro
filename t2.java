import java.util.Scanner;

public class t2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // массивы для точек
        double[] x = new double[4];
        double[] y = new double[4];

        for (int i = 0; i < 4; i++) {
            System.out.print("Введите x" + (i + 1) + ": "); // +1, т.к индекс на 1 ниже
            x[i] = sc.nextDouble();
            System.out.print("Введите y" + (i + 1) + ": ");
            y[i] = sc.nextDouble();
        }

        double[] d = new double[6]; // складываем квадраты расстояний
        int counter = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = i + 1; j < 4; j++) {
                d[counter] = (x[i] - x[j]) * (x[i] - x[j]) + (y[i] - y[j]) * (y[i] - y[j]); // квадрат расстояния м-у i и j
                counter++;
            }
        }

        for (int i = 0; i < d.length - 1; i++) { // i от 0 до 4
            for (int j = 0; j < d.length - 1 - i; j++) { // j идет от 0 до 5-i
                if (d[j] > d[j + 1]) { // большее число двигаем вправо
                    double transit = d[j];
                    d[j] = d[j + 1];
                    d[j + 1] = transit;
                }
            }
        }

        double side = d[0]; // сторона
        double diag = d[4]; // диагональ

        boolean sidesRight = (d[0] == side && d[1] == side && d[2] == side && d[3] == side); // стороны равны
        boolean diagsRight = (d[4] == diag && d[5] == diag); // диагонали равны
        boolean pifagor = (diag == 2 * side); // тр пифагора верна

        if (sidesRight && diagsRight && pifagor) {
            System.out.println("Да, точки могут быть вершинами квадрата.");
        } else {
            System.out.println("Нет, точки не образуют квадрат.");
        }
    }
}
