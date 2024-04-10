public class Product {
    private int id;
    private String name;
    private int quantity;

    public static String nameStore = "CodeGym"; // Đại diện cho thành phần chung của tất cả đối tượng

    public Product(int id, String name, int quantity) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
    }

    public Product(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }


    public static void go() { // Các phương thức static chỉ có thể gọi các thành phần static
        System.out.println(nameStore);
    }

    public void go2() {
        System.out.println(nameStore);
    }

    public static void main(String[] args) {
        Product product = new Product(1, "Bánh mì", 22);
        Product product2 = new Product(2, "Bánh mì 2", 23);
        System.out.println(Product.nameStore);
        Product.nameStore = "Hà Nội";
        System.out.println(Product.nameStore);
    }
}
