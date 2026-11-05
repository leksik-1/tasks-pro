public class t4 {

    static double calc() {
        double s = Math.sqrt(99.0);

        for (int k = 96; k >= 3; k -= 3) {
            s = Math.sqrt(k + s);
        }
        return s;
    }

    public static void main(String[] args) {
        double y = calc();
        System.out.println("y = " + y);
    }
}
