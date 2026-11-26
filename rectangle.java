public class rectangle {
    public double xMin;
    public double yMin;
    public double xMax;
    public double yMax;

    public rectangle(double xMin, double yMin, double xMax, double yMax) {
        this.xMin = xMin;
        this.yMin = yMin;
        this.xMax = xMax;
        this.yMax = yMax;
    }

    public boolean isPointInside(double x, double y) {
        return x >= xMin && x <= xMax && y >= yMin && y <= yMax;
    }
}
