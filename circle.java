public class circle {
    public double x0;
    public double y0;
    public double r;

    public circle(double x0, double y0, double r) {
        this.x0 = x0;
        this.y0 = y0;
        this.r = r;
    }

    public boolean isPointInside(double x, double y) {
        double dx = x - x0;
        double dy = y - y0;
        return dx * dx + dy * dy < r * r;
    }
}