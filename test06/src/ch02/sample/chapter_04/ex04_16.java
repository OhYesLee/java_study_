package ch02.sample.chapter_04;

public class ex04_16 {
    public static void main(String[] args) {
        int sum = 0;
        int i = 0;

        while (true) {
            if (sum > 100)
                break;
            ++i;
            sum += i;
        }

        System.out.println("i = " + i);
        System.out.println("sum = " + sum);
    }
}
