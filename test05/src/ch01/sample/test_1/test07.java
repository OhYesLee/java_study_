package ch01.sample.test_1;

import java.util.Scanner;

/*
1330번

두 정수 A와 B가 주어졌을 때, A와 B를 비교하는 프로그램을 작성하시오.
 */
public class test07 {
    public static void main(String[] args) {
        System.out.println("두 정수를 띄어쓰기 후 연속해서 작성하시오");
        Scanner sc = new Scanner(System.in);
        String num = sc.nextLine();
        // .next() -> 공백 제거
        // /nextLine() -> 공백 유지
        String splitArr[] = num.split(" ");
        int n1, n2;
        n1 = Integer.parseInt(splitArr[0]);
        n2 = Integer.parseInt(splitArr[1]);
        if (n1 == n2) {
            System.out.println("==");
        } else if (n1 > n2) {
            System.out.println(">");
        } else {
            System.out.println("<");
        }
    }
}
