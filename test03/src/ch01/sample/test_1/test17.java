package ch01.sample.test_1;

import java.util.Scanner;

/*
8393번
n이 주어졌을 때, 1부터 n까지 합을 구하는 프로그램을 작성하시오.
 */
public class test17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = 0;
        for (int i = 0; i <= n; i++) {
            r += i;
        }
        System.out.println(r);
    }
}
