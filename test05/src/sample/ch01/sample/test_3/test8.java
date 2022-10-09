package sample.ch01.sample.test_3;

import java.util.Scanner;

/*
4344번

대학생 새내기들의 90%는 자신이 반에서 평균은 넘는다고 생각한다. 당신은 그들에게 슬픈 진실을 알려줘야 한다.
%.3f 소수점 3자리까지 출력
 */
public class test8 {
    public static void main(String[] args) {
		/*
		 	첫째 줄에는 테스트 케이스의 개수 C가 주어진다.

			둘째 줄부터 각 테스트 케이스마다 학생의 수 N(1 ≤ N ≤ 1000, N은 정수)이 첫 수로 주어지고,

			이어서 N명의 점수가 주어진다. 점수는 0보다 크거나 같고, 100보다 작거나 같은 정수이다.
		 */
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int numberPeople, sum, overPeople;
        double r, per;

        for (int i = 0; i < count; i++) {
            numberPeople = sc.nextInt();
            sum = 0;
            overPeople = 0;
            r = 0;

            int score[] = new int[numberPeople];
            for (int j = 0; j < score.length; j++) {
                score[j] = sc.nextInt();
                sum = sum + score[j];
            }
            for (int j = 0; j < score.length; j++) {
                if (score[j] > (double) sum / numberPeople) {
                    overPeople++;
                }
            }

            r = (double) overPeople / numberPeople * 100;

            per = Math.round(r * 1000) / 1000.0;

            System.out.printf("%.3f", per);
            System.out.println("%");
        }
    }
}
