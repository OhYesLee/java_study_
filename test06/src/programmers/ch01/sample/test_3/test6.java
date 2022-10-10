package programmers.ch01.sample.test_3;

import java.util.Scanner;

/*
1546번
세준이는 기말고사를 망쳤다. 세준이는 점수를 조작해서 집에 가져가기로 했다. 일단 세준이는 자기 점수 중에 최댓값을 골랐다.
이 값을 M이라고 한다. 그리고 나서 모든 점수를 점수/M*100으로 고쳤다.
예를 들어, 세준이의 최고점이 70이고, 수학점수가 50이었으면 수학점수는 50/70*100이 되어 71.43점이 된다.
세준이의 성적을 위의 방법대로 새로 계산했을 때, 새로운 평균을 구하는 프로그램을 작성하시오.
 */
public class test6 {
    public static void main(String[] args) {
		/*
		 	두 자연수 A와 B가 있을 때, A%B는 A를 B로 나눈 나머지 이다. 예를 들어, 7, 14, 27, 38을 3으로 나눈 나머지는 1, 2, 0, 2이다.
			수 10개를 입력받은 뒤, 이를 42로 나눈 나머지를 구한다. 그 다음 서로 다른 값이 몇 개 있는지 출력하는 프로그램을 작성하시오.
		 */
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int sub[] = new int[N];
        double M = 0;
        for (int i = 0; i < sub.length; i++) {
            sub[i] = sc.nextInt();
        }
        for (int i = 0; i < sub.length; i++) {
            if (M < sub[i]) {
                M = (double) sub[i];
                i--;
            }
        }
        double newSub[] = new double[N];
        double sum = 0;
        for (int i = 0; i < sub.length; i++) {
            newSub[i] = (double) sub[i] / M * (double) 100;
            sum = newSub[i] + sum;
        }
        System.out.println(sum / (double) N);
    }
}
