import java.util.Scanner;

public class уу3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] x = new double[10];
        for (int i = 0; i < 10; i++) {
            System.out.println("Ввод:");
            x[i] = sc.nextDouble();
        }
        
        sc.close();
        
        
        for (int y = 0; y < x.length-1; y++) {
            for (int j = 0; j < x.length-1-y; j++) {
                if (x[j] < x[j+1]) {
                    double tt = x[j];
                    x[j] = x[j+1];
                    x[j+1] = tt;
                    System.out.println(x[i]);
    
                    
            }
        }
    }
    }
}
