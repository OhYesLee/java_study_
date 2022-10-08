package sample.ch01.sample.test_2;

import java.util.Scanner;

/*
10871번
정수 N개로 이루어진 수열 A와 정수 X가 주어진다. 이때, A에서 X보다 작은 수를 모두 출력하는 프로그램을 작성하시오.
 */
public class test24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int a[] = new int[N];
        int X = sc.nextInt();
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
            if (a[i] < X) {
                System.out.println(a[i]);
            }
        }
    }
}
