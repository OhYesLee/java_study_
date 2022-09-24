package sample.test;

import java.util.Scanner;

/*
2523번
첫째 줄부터 2×N-1번째 줄까지 차례대로 별을 출력한다.
예제
입력3
*
**
***
**
*

 */
public class test28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        // 1 ~ 입력한 수까지 하나씩 증가하면서 출력
        for (int i = 1; i <= num; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // 입력한수 -1 ~ 1까지 하나씩 감소하면서 출력
        for (int i = num - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
