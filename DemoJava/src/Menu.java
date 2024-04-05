import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int choice;
        do {
            System.out.println("============== Main Menu ===============");
            System.out.println("1. Show All Product");
            System.out.println("2. Add Product");
            System.out.println("3. Edit Product");
            System.out.println("4. Delete Product");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Bạn đang ở show All");
                    break;
                case 2:
                    System.out.println("Bạn đang ở add");
                    break;
                case 3:
                    System.out.println("Bạn đang ở edit");
                    break;
                default:
                    System.out.println("Không có lựa chọn này");
            }
        } while (choice != 0);




        int a = 1;
        int b = 2;
        int c = b;
        c = 3;
    }
}
