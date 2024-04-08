public class Main {
    public static void main(String[] args) {
        // Khởi tạo đối tượng Student
        Student sinhVien = new Student("Linh", 10, 2.0);
        Student sinhVien2 = new Student("C02", 20);
        System.out.println(sinhVien2.name); // Truy xuất thuộc tính đối tuượng sinhVien2
        sinhVien2.goToSchool(); // Truy xuất phương thức
        System.out.println(sinhVien2.score); // 0.0

        int a; // Biến cục bộ thì không có giá trị mặc định
        System.out.println(a);



        /*
        Student student = null;
        System.out.println(student.name); // Lỗi: cố gắng truy cập vào đối tượng null
         */

        // Tạo một lớp Product có name, price, quantity và phương thức getName()
        // Tạo 2 đối tượng Product.
    }
}