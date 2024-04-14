import java.util.ArrayList;

public interface Demo<E> {
    void show(E e);

    static void run() {
        System.out.println("Hello");
    }

    default void run2() {
        System.out.println("Hello");
    }

    void run3();
}


//class Main3 implements Demo<Shape> {
//    @Override
//    public void show(Shape shape) {
//        ArrayList<Integer> arr = new ArrayList<>();
//        Demo<Shape> main = new Main3();
//        main.run2();
//        Demo.run();
//    }
//
//    @Override
//    public void run3() {
//
//    }
//
//}











class Address {
    int id;
    String name;
    String city;
    int code;

    public Address(int id, String name, String city, int code) {
        this.id = id;
        this.name = name;
        this.city = city;
        this.code = code;
    }
}


class Student  {
    String name;
    int age;

    Address address; // Student has a address
}

// 2 lớp Student và ManagerStudent. Trong ManagerStudent thì có một mảng các Student
class Student1 {

}

class ManagerStudent {
    private Student1[] s;
}



















