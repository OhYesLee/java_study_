package sample.ch01.sample.chapter_04;

import java.util.Scanner;

public class ex04_4 {
    public static void main(String[] args) {
        int score = 0; // 점수를 저장하기 위한 변수
        char grade = ' '; // 학점을 저장하기 위한 변수. 공백으로 초기화한다.
        System.out.println("점수를 입력하세요.=>");
        Scanner sc = new Scanner(System.in);
        score = sc.nextInt(); // 화면을 통해 입력받은 숫자를 score에 저장

        if (score >= 90) { //score가 90점보다
            grade = 'A';
        } else if (80 <= score && score < 90) {
            grade = 'B';
        } else if (70 <= score && score < 80) {
            grade = 'C';
        } else {
            grade = 'D';
        }
        System.out.println("당신의 학점은 " + grade + "입니다.");
    }
}
