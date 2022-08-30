package sample.chapter_03;

public class ex03_test3_3 {
    public static void main(String[] args) {
        int num = 456;
        System.out.println(num / 100 * 100);

        //답 num/100*100
        //나눗셈연산자는 반올림을 하지 않고 버림을 한다. 이 성질을 이용한 문제이다.
        // 어 떤 숫자를 100으로 나누면 십의 자리와 일의 자리가 잘리고 백의 자리가 일의 자리가 된 다.
        // 즉, 456을 100으로 나누면 4가 되는 것이다. 여기에 다시 100을 곱하면 400이 된다.
        // 10의 n제곱을 나눴다가 다시 곱하면 간단하게 아래 자리의 수를 0으로 만들 수 있다.

    }
}
