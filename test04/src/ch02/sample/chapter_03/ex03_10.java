package ch02.sample.chapter_03;

public class ex03_10 {
    public static void main(String[] args) {
        long a = 1_000_000 * 1_000_000;  //  int* int -> imt 오버플로우 발생!
        long b = 1_000_000 * 1_000_000L;

        System.out.println("a =" + a);
        System.out.println("b = " + b);

    }
}
