import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        /*
        // Khai báo mảng
        int[] array = new int[10];
        // Khởi tạo 1 mảng int chứa tối đa 10 phần tử
        // Khi khởi tạo như trên mảng sẽ tự động có phần tử mặc định tương ứng với kiểu dữ liệu (int: 0; double: 0.0; char: ''; String: null)
        // array[0] = "Linh"; // Không thể chứa kiểu dữ liệu khác
        System.out.println(array[5]); // Truy cập phần tử ở vị trí 5;
        System.out.println(Arrays.toString(array));

         */
//        int[] arr = {1, 5, 6, 4, 2, 4, 32}; // Cách khai báo 2
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }
//        // Cách duyệt 2: dùng for each
//        System.out.println("Cách 2: ");
//        for(int item: arr) { // 5
//            System.out.println(item);
//        }


        int[] a = {1, 9, 3, 2}; //  {1, 9, 3, 2} => {1, 3, 9, 2} => {1, 2,3,9}
        for (int i = 0; i < a.length - 1; i++) {  // i = 2
            for (int j = i + 1; j < a.length; j++) { // j = 3
                if (a[i] > a[j]) { // 9 > 3
                    int x = a[i];
                    a[i] = a[j];
                    a[j] = x;
                }
            }
        }
        System.out.printf("Hello %d", 10);

        int[] a1 = {1, 3, 4};
//        m(4.5, 3.4, 2.1);
    }


    static int m(int... x) { // int[]x = [1, 3 ,4]
        int b = 0;
        for (int a : x) {
            b += a;
        }
        return b;
    }

    public static void getA(int[] arr, int a) {

    }

    static void method1(int a){  }

    static void method1(float a){  }

    static void method1(String c){  }

    static void method1(double d){  }
}