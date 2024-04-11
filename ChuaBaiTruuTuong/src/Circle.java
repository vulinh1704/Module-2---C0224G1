public class Circle implements Resizeable, Colorable {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Bánh kính là: " + this.radius;
    }

    @Override
    public void resize(double percent) { // 60%
        this.radius = this.radius * percent / 100 + this.radius;
    }

    @Override
    public void howToColor() {
        System.out.println("Color fill all");
    }
}
