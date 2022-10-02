package sample.test_1;

/*
Java로 배열안에 있는 값 중에 최대값을 구하는 코드를 작성해보았다.
 */
public class test15 {
    public static void main(String[] args) {
		/*
		 	메소드명 : max (o)
			기 능 : 주어진 int형 배열의 값 중에서 제일 큰 값을 반환한다. (o)
			만일 주어진 배열이 null이거나 크기가 0인 경우, -999999를 반환한다.
			반환타입 : int
			매개변수 : int[] arr - 최대값을 구할 배열
		 */
        int[] data = {3, 2, 9, 4, 7};
        int[] check = null;
        int[] zero = new int[0];
        System.out.println(java.util.Arrays.toString(data));
        System.out.println("최대값:" + max(data));
        System.out.println();
        System.out.println(java.util.Arrays.toString(check));
        System.out.println("최대값:" + max(check));
        System.out.println();
        System.out.println(java.util.Arrays.toString(zero));
        System.out.println("최대값:" + max(zero));
    }


    static int max(int[] arr) {
        // 최댓값이기때문에 0으로 초기화해준다
        int max = 0;
        // null 체크, length 체크
        if (arr == null || arr.length == 0) {
            max = -999999;
        }
        // null 이나 크기가 0아닐시 max값 산
        else {
            for (int i = 0; i < arr.length; i++) {
                if (max < arr[i]) {
                    max = arr[i];
                }
            }
        }
        return max;
    }
}

