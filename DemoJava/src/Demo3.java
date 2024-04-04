import java.util.Scanner;

public class Demo3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập số: ");
        int number = input.nextInt(); // 123
        int hangTram = number / 100;
        readNumber(hangTram);
        int hangChuc = (number / 10) % 10; // 123 / 10 = 12 % 10 = 2; 198 => 198 / 10 = 19 /
        readNumber(hangChuc);
        int hangDonVi = number % 10;
        readNumber(hangDonVi);
    }

    public static void readNumber(int number) {
        switch (number) {
            case 0:
                System.out.print(" Không ");
                break;
            case 1:
                System.out.print(" Một ");
                break;
            case 2:
                System.out.print(" Hai ");
                break;
            case 3:
                System.out.print(" Ba ");
                break;
            case 4:
                System.out.print(" Bốn ");
                break;
        }
    }

}
