package ch01.sample.chapter_04;

import java.util.Scanner;

public class re_ex04_14 {
    public static void main(String[] args) {
        int num = 0, sum = 0;
        System.out.println("숫자를 입력하세요(예:1233456)=> ");

        Scanner scanner = new Scanner(System.in);
        String tmp = scanner.nextLine(); //화면을 통해 입력받은 내용을 tmp 에 저장
        num = Integer.parseInt(tmp); // 입력받은 문자열(tmp)을 숫자로 변환

        while (num != 0) {
            // num 을 10으로 나눈 나머지를 sum에 더함
            sum += num % 10; // sum = sum + num%10;
            System.out.printf("sum=%3d num%d%n", sum, num);

            num /= 10; // num = num / 10; num을 10으로 나눈 값을 다시 num에 저장
        }
        System.out.println("각 자리수의 합: " + sum);
    }
}
