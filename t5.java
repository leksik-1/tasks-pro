public class t5 {
    public static void main(String[] args) {
        head(5, 7);
    }

    public static void head(int h, int w) {

        System.out.print("*");
        for (int j = 0; j < w - 2; j++) {
            System.out.print("-");
        }
        System.out.println("*");

        for (int i = 0; i < h - 2; i++) {
            System.out.print("|");
            for (int j = 0; j < w - 2; j++) {
                System.out.print(" ");
            }
            System.out.println("|");
        }

        System.out.print("*");
        for (int j = 0; j < w - 2; j++) {
            System.out.print("-");
        }
        System.out.println("*");
    }
}

