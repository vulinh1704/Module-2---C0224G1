public class Student { // Đặt teen class theo quy tắc PascalCase, danh từ
     String name; // Khai báo các thuộc tính (đặc điểm của các đối tượng student
     int age;
     double score = 0.0; // = 0.0
     // Các biến Thuộc Tính thì có giá trị mặc định tương ứng với kiểu dữ liệu
    // (int: 0, double: 0.0, String: null,...)

     Student(String name, int age, double score) { // constructor: phương thức khởi tạo trùng với tên lớp
         this.name = name; // Gán giá trị cho thuộc tính
         this.age = age;
         this.score = score;
     }

     Student(String name, int age) { // Có thể có nhiều constructor
         this.name = name;
         this.age = age;
     }



     void goToSchool() { // Khởi tạo phương thức
         System.out.println("Student is going");
     }
}
