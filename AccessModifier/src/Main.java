public class Main {
    public static void main(String[] args) {
        Student student = new Student("C02", 22);
        student.name = "C02";
//        System.out.println(student.id);
        System.out.println(student.name);
        System.out.println(student.age);
        student.play();
//        student.eat();
        System.out.println(student.getId());
        student.setId(23223224);
        System.out.println(student.getId());
    }
}
