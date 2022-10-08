package ch02.sample.test_1;

import java.util.Scanner;

/*
2739번

N을 입력받은 뒤, 구구단 N단을 출력하는 프로그램을 작성하시오. 출력 형식에 맞춰서 출력하면 된다.
 */
public class test11 {
    public static void main(String[] args) {
        //첫째 줄에 N이 주어진다. N은 1보다 크거나 같고, 9보다 작거나 같다.
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        if (N >= 1 && N <= 9) {
            for (int i = 1; i <= 9; i++) {
                System.out.println(N + " * " + i + " = " + (N * i));
            }
        }
    }
}