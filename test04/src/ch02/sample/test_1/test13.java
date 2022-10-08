package ch02.sample.test_1;

/*
Java를 이용하여 피보나치수열을 구성해보았다.
피보나치 수란
피보나치 수는 첫째 및 둘째 항이 1이며 그 뒤의 모든 항은 바로 앞 두 항의 합인 수열이다.
0번째 항은 0으로 잡기도한다.
식으로 표현하자면
a(n+2번) = a(n번) + a(n+1번)
이렇게 표현이 된다.
 */
public class test13 {
    public static void main(String[] args) {
        // fibonnaci 피보나치
        // 증권, 선물에서 자주 사용
		/*
		 	n + (n + 1) = n + 2
		 	0 1 1 2 3 5 8 13 21 34
		 */
		/*
		 	규칙
		 	a(n+2) = a(n) + a(n+1)
		 	a = 0;
		 	a1 = 1;
		 	a(2) = a + a1
		 */
        int f0 = 0, f1 = 1, f2;
        for (int i = 0; i < 10; i++) {
            System.out.println(f0);
            f2 = f0 + f1;
            f0 = f1;
            f1 = f2;
        }
    }
}
