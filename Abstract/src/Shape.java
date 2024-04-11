public abstract class Shape { // Khai báo một abstract class
    // Có thể khai báo thuộc tính, phuương thức, constructor như một lớp bình thường
    private String color;

    public Shape(String color) {
        this.color = color;
    }

    public abstract double getS(); // Khai báo một phương thúc abstract (phải nằm trong lớp abstract)
    public abstract double getV();

    public Shape() {
    }

    public String getColor() { // phương thức non abstract
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
