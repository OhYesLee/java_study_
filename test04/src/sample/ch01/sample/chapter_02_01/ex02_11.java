package sample.ch01.sample.chapter_02_01;

public class ex02_11 {
    public static void main(String[] args) {
        short sMin = -32768, sMax = 32767;
        char cMin = 0, cMax = 65535;

        System.out.println("sMin = " + sMin);
        System.out.println("sMin-1 = " + (short) (sMin - 1)); //최소값 -1 == 최대값
        System.out.println("sMax = " + sMax);
        System.out.println("sMax+1 = " + (short) (sMax + 1)); //최대값 +1 == 최소값
        System.out.println("cMin = " + (int) cMin);
        System.out.println("cMin -1 = " + (int) --cMin); //최소값 -1 == 최대값
        System.out.println("cMax = " + (int) cMax);
        System.out.println("cMax+1= " + (int) ++cMax); //최대값 +1 == 최소값

    }
}
