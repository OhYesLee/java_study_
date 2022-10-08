package ch01.sample.test_1;

/*
Java로 배열을 섞어주는 프로그램을 작성해보았다.
 */
public class test14 {
    public static void main(String[] args) {
        /*
         * 메소드명 : shuffle 기 능 : 주어진 배열에 담긴 값의 위치를 바꾸는 작업을 반복하여 뒤섞이게 한다.
         * 처리한 배열을 반환한다.
         * 반환타입 : int[] 매개변수 : int[] arr – 정수 값이 담긴 배열
         */

        int[] original = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println("원본");
        System.out.println(java.util.Arrays.toString(original));

        int[] result = shuffle(original);
        System.out.println("\n셔플본");
        System.out.println(java.util.Arrays.toString(result));

    }

    static int[] shuffle(int[] arr) {
        int r1, r2;
        int temp;
        for (int i = 0; i < arr.length; i++) {
            //for문이 돌아갈때마다 바뀌는 난수 r1, r2생성
            r1 = (int) (Math.random() * 9);
            r2 = (int) (Math.random() * 9);
            //변수에 배열 r1번의 값을 담기 -> swap용
            temp = arr[r1];
            //r1번째 값을 r2번째 값으로 바꿔주기
            arr[r1] = arr[r2];
            //r2번째 값에 swap용변수(r1)번 값 담아주기
            arr[r2] = temp;
        }
        return arr;
    }
}

