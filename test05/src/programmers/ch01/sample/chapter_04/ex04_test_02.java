package programmers.ch01.sample.chapter_04;


//[4-2] 1부터 20까지의 정수 중에서 2 또는 3의 배수가 아닌 수의 총합을 구하시오.
public class ex04_test_02 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 20; i++) {
            if (i % 2 != 0 && i % 3 != 0) //i가 2또는 3의 배수가 아닐 때만 sum에 i를 더한다.
                sum += i;
        }
        System.out.println("sum=" + sum);
    }
}
