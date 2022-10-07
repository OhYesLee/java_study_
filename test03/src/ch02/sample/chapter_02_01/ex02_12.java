package ch02.sample.chapter_02_01;

public class ex02_12 {
    public static void main(String[] args) {
        String str = "3";

        //문자열을 문자로 변환
        System.out.println(str.charAt(0) - '0');
        System.out.println('3' - '0' + 1);
        //Integer.parseInt()은 문자열을 숫자로 변환
        System.out.println(Integer.parseInt("3") + 1);
        System.out.println("3" + 1);
        // 숫자를 문자로 변환 - 숫자에 '0'을 더한다.
        System.out.println((char) (3 + '0'));

    }
}
