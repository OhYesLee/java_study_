package programmers.ch01.sample.test_2;

import java.util.Scanner;

/*
10996번
첫째 줄부터 2×N-1번째 줄까지 차례대로 별을 출력한다.
예제
입력1
*
입력2
*
 *
*
 *
입력3
*
 *
*
 *
*
 *
*
 */
public class test30 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n * 2; i++) {
            // 짝수행
            if (i % 2 == 1) {
                for (int j = 0; j < n; j++) {
                    if (j % 2 == 1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            // 홀수행
            else {
                for (int j = 0; j < n; j++) {
                    if (j % 2 == 1) {
                        System.out.print(" ");
                    } else {
                        System.out.print("*");
                    }
                }
            }
            System.out.println();
        }
    }
}
