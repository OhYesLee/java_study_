package programmers.ch01.sample.chapter_03;

public class ex03_16 {
    public static void main(String[] args) {
        boolean b = true;
        char ch = 'c';

        System.out.printf("b=%b%n", b);
        System.out.printf("!b=%b%n", !b);
        System.out.printf("!!b=%b%n", !b);
        System.out.printf("!!!b=%b%n", !b);
        System.out.println();

        System.out.printf("ch=%c%n", ch);
        System.out.printf("ch<'a'||ch>'z'=%b%n", ch < 'a' || ch > 'z');
        System.out.printf("!('a'<=ch&& ch<='z')=%b%n", !('a' <= ch && ch > 'z'));
        System.out.printf("'a'<=ch&& ch<='z'=%b%n", 'a' <= ch && ch > 'z');

    }
}
