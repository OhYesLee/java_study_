package ch02.sample.chapter_04;


//[4-3] 1+(1+2)+(1+2+3)+(1+2+3+4)+...+(1+2+3+...+10)의 결과를 계산하시오.
public class ex04_test_03 {
    public static void main(String[] args) {
        int sum = 0;
        int totalSum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i; //sum = sum + i
            totalSum += sum; //totalSum = totalSum + sum
        }
        System.out.println("totalSum=" + totalSum);
    }
}
