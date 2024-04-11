public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(3.6);
        Rectangle rectangle = new Rectangle(3.2, 4.6);
        System.out.println("Trước thay đổi : ");
        System.out.println(circle);
        System.out.println(rectangle);

        circle.resize(Math.random() * 100);
        rectangle.resize(Math.random() * 100);
        System.out.println("Sau thay đổi: ");
        System.out.println(circle);
        System.out.println(rectangle);
        circle.howToColor();
    }
}