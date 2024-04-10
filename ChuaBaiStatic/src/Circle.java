public class Circle {
    private int id;
    private double radius;
    public static final double PI = 3.14;
    private static int idIncrement = 1;

    public static int countCircle = 0;

    public static double sumS = 0;

    public Circle(double radius) {
        this.id = idIncrement;
        this.radius = radius;
        idIncrement++;
        countCircle++;
        sumS = sumS + getS();
    }

    public double getS() {
        return PI * radius * radius;
    }

    public double getC() {
        return 2 * PI * radius;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Hình tròn có id: " + this.id + " - Bán kính: " + this.radius + " - S: " + getS() + " - C: " + getC();
    }
}
