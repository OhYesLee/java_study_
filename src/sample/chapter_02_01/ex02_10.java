package sample.chapter_02_01;

import java.util.Scanner; //Scanner 를 사용하기 위해 추가됨

public class ex02_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //Scanner 클래스의 객체를 생성

        System.out.println("두자리 정수를 하나 입력해주세요.===>");
        String input = scanner.nextLine(); // 입력받은 내용을 input에 저장
        int num = Integer.parseInt(input); //입력받은 문자열을 숫자로 변환 // int 타입의 값으로 변환
/*
입력받은 문자영을 숫자로 변환하렵면, Integer.paraeInt()라는 메서드를 이용해야 한다.
이 메서드는 문자열을 int타입의 정수로 변환한다.
 */
        System.out.println("입력내용 : " + input);
        System.out.printf("num=%d%n", num);

    }
}
