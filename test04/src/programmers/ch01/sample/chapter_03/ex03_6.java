package programmers.ch01.sample.chapter_03;

public class ex03_6 {
    public static void main(String[] args) {
        int a = 10;
        int b = 4;
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a / b);
        System.out.println(a * b);
        System.out.println(a / (float) b);
        System.out.println("===========================");
        System.out.printf("%d+%d =%d%n", a, b, a + b);
        System.out.printf("%d-%d =%d%n", a, b, a - b);
        System.out.printf("%d*%d =%d%n", a, b, a * b);
        // int 10 / int 4 -> int 2 소수점 이하는 버려진다.
        System.out.printf("%d/%d =%d%n", a, b, a / b);
        //int 10 / float 4.0f -> float10.0f / float4.0f -> float 2.5f
        System.out.printf("%d/%f =%f%n", a, (float) b, a / (float) b);
    }
}
