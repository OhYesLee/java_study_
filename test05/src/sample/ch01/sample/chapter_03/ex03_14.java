package sample.ch01.sample.chapter_03;

public class ex03_14 {
    public static void main(String[] args) {
        String str2 = new String("abc");
        String str1 = "abc";
        //equals() 는 두 문자열의 내용이 같으면 true, 다르면 false를 결과로 반환
        System.out.printf("\"abc\"==\"abc\"?%b%n", "abc" == "abc");
        System.out.printf("str1==\"abc\"?%b%n", str1 = "abc");
        System.out.printf("str2==\"abc\"?%b%n", str2 = "abc");
        System.out.printf("str1.equals(\"abc\"?%b%n", str1.equals("abc"));
        System.out.printf("str2.equals(\"abc\"?%b%n", str2.equals("abc"));
        System.out.printf("str2.equals(\"ABC\"?%b%n", str2.equals("ABC"));
        // 대소문자를 구별하지 않고 비교하고 싶으면, equalsIgnoreCase() 을 이용하면 된다.
        System.out.printf("str2.equalsIgnoreCase(\"ABC\")? %b%n", str2.equalsIgnoreCase("ABC"));


    }
}
