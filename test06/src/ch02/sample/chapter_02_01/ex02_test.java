package ch02.sample.chapter_02_01;

public class ex02_test {
    public static void main(String[] args) {
        System.out.println("1" + "2");
        int x = 1;
        int y = 2;
        int z = 3;

        int tmp = x;
        x = y;
        y = z;
        z = tmp;
        System.out.println("x= " + x);
        System.out.println("y= " + y);
        System.out.println("z= " + z);

    }
}
