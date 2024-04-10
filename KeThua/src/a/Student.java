package a;

public class Student extends Person{
    private double score;

    public Student(int id, String name, double score) {
        super(id, name);
        this.score = score;
    }

    @Override
    public void speak() {
        System.out.println("Student is speaking");
    }

    // Overriding: Ghi đè phương thức xảy mối quan hệ  kế thừa
    // Cùng tên, cùng kiểu dữ liệu trả về, cùng thanm số truyền vào
    // Khác nhau code triển khai
    // Access modifie  ở lớp con phải rộng hơn lớp cha

}
