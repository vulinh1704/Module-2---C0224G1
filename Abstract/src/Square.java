public class Square extends Shape{
    private int a;

    @Override
    public double getS() {
        return a * a;
    }

    @Override
    public double getV() {
        return 4 * a;
    }
    // Các lớp non abstract thì phải triển khai tất cả phương thức abstract
}
