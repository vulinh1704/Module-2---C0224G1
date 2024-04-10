public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(2.4);
        System.out.println(circle);

        Circle circle2 = new Circle(3.4);
        System.out.println(circle2);
        System.out.println("Số lượng hình tròn tạo từ lớp Circle: " + Circle.countCircle);
        System.out.println("Tổng diện tích các hình tròn là: " + Circle.sumS);

        A.B o = new A.B();
        A.C o2 = new A().new C();
        A.C o3 = new A.C();
    }
}

class A {
    static public class B {
    }

    public class C {
    }
}
