import java.util.Scanner;

public class Demo {

    public static void main(String[] args) {

        // System.out.println(a);
        /*
        Kiểu dữ liệu:
        số nguyên (1, 3,5,8)
        Kiểu số thực: 1.4, 2.6
        Kiểu boolean: true | false
        Kiểu chữ: string ""
        Kiểu ký tự: 'D', 'A'

        int a = 10; // integer
        int b;
        b = 20;
        int c = 20, d = 21, e = 22;
        System.out.println(b);

        double a = 4.5;
        float f = 5.3f;
        boolean isHandsome = false;
        String str = "Linh is handsome";
        char c = 'H';// character
        // Không được đặt tên biến có ký tự đặc biệt ngoại trừ ký tự $, _
        int $ = 10;
        int a_ = 20;
        final double PI = 3.14; // Sử dụng final để khai báo hằng số.
         */

        /*
        Các loại toán tử:
        - Toán tử toán học: + , - , * , /, %, ++, --
        - Toán tử gán: =, +=, -=, /=, *=
        - Toán tử so sánh: >, <, >=, <=, ==, !=
        - Toán tử logic: &&, ||, |, &


         int a = 10;
        a %= 10;
        System.out.println(a); // 0
//        if(a < 10) System.out.println("Hello");
        switch (a) {
            case 0:
                System.out.println("Hi");
                break;
            default:
                System.out.println("No");
        }
         */

//        Scanner input = new Scanner(System.in);
//        System.out.println("Mhap so di: ");
//        int a = input.nextInt();
//        double b = input.nextDouble();
//        String str = input.nextLine();
//        System.out.println(str);

        // main + tab
        // sout + tab
        // Hi



    /*
    int, short, byte, long
    double, float
    char
    boolean
    String
     */
//    String a = "Linh";


        Scanner inputNumber = new Scanner(System.in);
        Scanner inputString = new Scanner(System.in);
        // Alt + Enter

        System.out.println("Nhập vào tuooir");
        int age = inputNumber.nextInt();  // "Enter <=> \n"
        System.out.println("Nhập tên: ");
        String name = inputString.nextLine(); // "" \n
        System.out.println(name + " có tuoi là: " + age);



    }

}
