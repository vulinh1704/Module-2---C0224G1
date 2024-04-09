package A;

public class Student {
    int id; // Đây là access modifier default: cho phép truy cập trong cùng 1 package
    String name;

    protected int age;
    // Từ khóa protected cho phép truy cập trong cùng 1 package hoặc ngoài package nhưng phải nằm trong mối quan hệ kế thừa

    void play() {
        System.out.println("Student is playing");
    }
}
