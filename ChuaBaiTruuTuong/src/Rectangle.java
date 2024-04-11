public class Rectangle implements Resizeable {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Hình cữ nhật có chiều dài: " + this.height + " - chiều rộng: " + this.width;
    }

    @Override
    public void resize(double percent) {
        this.width = this.width + this.width / 100 * percent;
        this.height = this.height + this.height / 100 * percent;
    }
}
