package programmers.ch01.sample.chapter_04;


//[4-5] 다음의 for문을 while문으로 변경하시오.
public class ex04_test_05 {
    public static void main(String[] args) {
//        for (int i = 0; i <= 10; i++) {
//            for (int j = 0; j <= i; j++)
//                System.out.print("*");
//            System.out.println();
//        }
        int i = 0;
        while (i <= 10) {
            int j = 0;
            while (j <= i) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }

    }
}
