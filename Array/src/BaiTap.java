import java.util.Arrays;

public class BaiTap {
    public static void main(String[] args) {
        int[] arr = new int[10];
        int size = 0;
        System.out.println("Mảng trước thêm: ");
        System.out.println(Arrays.toString(arr));

        size = addElement(arr, 2, size); // size = 1
        System.out.println("Mảng sau thêm: ");
        System.out.println(Arrays.toString(arr));

        size = addElement(arr, 32, size); // size = 2
        System.out.println("Mảng sau thêm: ");
        System.out.println(Arrays.toString(arr));


        size = insetElement(arr, -25, 1, size);
        System.out.println("Mảng sau khi chèn: ");
        System.out.println(Arrays.toString(arr));

        searchElement(arr, size, 32);

        size = removeElement(arr, 1, size);
        System.out.println("Mảng sau khi xóa vị trí số 1: ");
        System.out.println(Arrays.toString(arr));

        editElement(arr, 0, 97);
        System.out.println("Mảng sau khi sửa là : ");
        System.out.println(Arrays.toString(arr));
    }

    public static void editElement(int[] array, int index, int item) {
        array[index] = item;
    }

    public static int removeElement(int[] array, int index, int size) {
        for (int i = index; i < size; i++) {
            array[i] = array[i + 1];
        }
        size--;
        return size;
    }

    public static void searchElement(int[] array, int size, int item) {
        for (int i = 0; i < size; i++) {
            if(array[i] == item) {
                System.out.println("Vị trí của phần tử " + item + " là: " + i);
            }
        }
    }

    public static int addElement(int[] array, int item, int size) {
        array[size] = item; // arr[1] = 32
        size++; // 2
        return size;
    }


    public static int insetElement(int[] arr, int item, int index, int size) {
        for (int i = size; i > index ; i--) {
            arr[i] = arr[i - 1];
        }
        arr[index] = item;
        size++;
        return size;
    }


    // ArrayList
}
