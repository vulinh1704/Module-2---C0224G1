package a;

public class Main {
    public static void main(String[] args) {
        Student student = new Student(1, "Linh", 1.0);
        student.speak();

        Person person = new Person(1, "C02");
        person.speak();

        Person p = new Student(1, "Linh", 2);
        //Kiểu khai báo        Kiểu thực tế
        // Đối tượng có kiểu dữ liệu lớp tham chiếu đến tượng của lớp con
        p.speak();
        System.out.println(p instanceof Student);
    }
}
