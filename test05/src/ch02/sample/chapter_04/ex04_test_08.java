package ch02.sample.chapter_04;


//[4-8] Math.random()을 이용해서 1부터 6사이의 임의의 정수를 변수 value에 저장하는 코드를 완성하라. (1)에 알맞은 코드를 넣으시오.
public class ex04_test_08 {
    public static void main(String[] args) {
        int value = (int) (Math.random() * 6) + 1;
        System.out.println("value:" + value);
    }
}
