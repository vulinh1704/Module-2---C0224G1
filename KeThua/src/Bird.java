public class Bird extends Animal { // Sử dụng từ khóa extends để kế thừa
    // Khi triển khai kế thừa thì lớp lấy tất cả thuộc tính và phương thức lớp cha trừ private

    private int id; // Có thể khai báo thêm thuộc tính và phương thức mới

    public Bird() {
        super();
//        this(1);
    }

    public Bird(int id) {
        this.id = id;
    }


//    public Bird() {
//        super(); // Gọi đến constructor có tham sô tương ứng ở lớp cha gần nhất
//    }

    public String go() {
        return super.getName() + " is going"; // Đại diện cho đối tượng lớp cha gần nhất
    }

    public String getName() {
        return "Helllo";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }



    // supper
}
