//final Sử dụng với lớp thì không thể cho phép lớp khác kế thừa
// sử dụng với pt thì không thể ghi đè
// Biến thì không thể gán lại giá trị
public class C {
    final int go() {
        return 1;
    }
}

class D extends C {
//    final int go() {
//        return 1;
//    }
}