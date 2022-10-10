package sample.ch01.sample.chapter_04;

public class ex04_7 {
    public static void main(String[] args) {
        int num = 0;

        //괄호{} 안의 내용을 5번 반복한다.

        /*
        임의의 정수만들기 Math.random()
        0.0 <= Math.random() <1.0
         */

        for (int i = 1; i <= 5; i++) {
            num = (int) (Math.random() * 6) + 1;
            System.out.println(num);
        }
    }
}
