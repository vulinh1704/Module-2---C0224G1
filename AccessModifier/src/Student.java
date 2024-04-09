public class Student {
    public String name = "Linh";
    public int age = 20;

    private int id = 1111; // Cho phép truy cập trong cùng một class

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void play() {
        System.out.println("Student is playing");
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private void eat() {
        System.out.println("Student is eating");
    }

    public static void main(String[] args) {
        Student s = new Student("Linh", 2);
        System.out.println(s.id);
        s.eat();
    }
}
