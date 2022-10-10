package programmers.ch01.sample.chapter_04;

public class ex04_17 {
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            if (i % 3 == 0) // 3의 배수이며 continue로 반복문 블럭의 끝으로 이동
                continue;
            System.out.println(i);
        }
    }
}
