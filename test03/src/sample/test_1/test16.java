package sample.test_1;

/*
Java로 배열의 값을 2배로 연산되도록하는 코드를 작성해보았다.
 */
public class test16 {
    public static void main(String[] args) {
		/*
		 	배열의 값에 *2배의 연산된 값이 산출되도록 메소드를 작성하시오.
		 */
        int num1[] = {1, 2, 3, 4, 5};
        System.out.println("원본");
        System.out.println(java.util.Arrays.toString(num1));
        System.out.println("getDouble");
        System.out.println(java.util.Arrays.toString(getDouble(num1)));
    }

    static int[] getDouble(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] * 2;
        }
        return arr;
    }
}
