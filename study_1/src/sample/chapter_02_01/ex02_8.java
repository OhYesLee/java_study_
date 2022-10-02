package sample.chapter_02_01;

public class ex02_8 {
    public static void main(String[] args) {
        int x = 10, y = 5;
        System.out.println("x=" + x);
        System.out.println("y=" + y);

//        x의 값을 tmp에 저장
        int tmp = x;
//        y의 값을 x에 저장
        x = y;
//        tmp에 저장된 값을 y에 저장
        y = tmp;
        System.out.println("x=" + x);
        System.out.println("y=" + y);

    }
}
