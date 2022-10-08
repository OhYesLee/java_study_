package ch02.sample.test_1;

import java.util.Scanner;

public class Baseball {
    int r_num[];
    int u_num[];
    boolean clear;

    public void init() {
        r_num = new int[3];
        u_num = new int[3];
        clear = false;

        random();
    }

    public void random() {
        boolean swit[] = new boolean[10];

        for (int i = 0; i < swit.length; i++) {
            swit[i] = false; // 00000 00000
        }

        int r, w;
        w = 0;
        while (w < 3) {
            r = (int) (Math.random() * 10); // 0 ~ 9
            if (swit[r] == false) {
                swit[r] = true; // 00100 00000
                r_num[w] = r + 1; // 1 ~ 10
                w++;
            }
        }

        for (int i = 0; i < r_num.length; i++) {
            System.out.println(i + " : " + r_num[i]);
        }
    }

    public void userInput() {
        Scanner sc = new Scanner(System.in);

        boolean check;
        int w1;
        while (true) {
            check = false;
            w1 = 0;
            while (w1 < 3) {
                System.out.print((w1 + 1) + "번째 수 = ");
                u_num[w1] = sc.nextInt();
                w1++;
            }

            // 같은 숫자가 있는지 첵크
            out:
            for (int i = 0; i < u_num.length; i++) {
                for (int j = 0; j < u_num.length; j++) {
                    if (u_num[i] == u_num[j] && i != j) {
                        check = true; // 입력한 같은 숫자가 있음
                        break out;
                    }
                }
            }

            if (check == false) {
                break;
            }
            System.out.println("입력한 숫자 중에 중복되는 숫자가 있습니다. 다시 입력해 주십시오");
        }
    }

    public boolean finding() {
        int strike, ball;
        strike = ball = 0;

        // ball
        for (int i = 0; i < u_num.length; i++) {
            for (int j = 0; j < r_num.length; j++) {
                if (u_num[i] == r_num[j] && i != j) {
                    ball++;
                }
            }
        }
        // strike
        for (int i = 0; i < u_num.length; i++) {
            if (u_num[i] == r_num[i]) {
                strike++;
            }
        }

        if (strike > 2) {
            return true;
        }

        System.out.println(strike + "스트라이크, " + ball + "볼 입니다");
        return false;
    }

    public void loop() {
        int w = 0;
        while (w < 10) {
            System.out.println((w + 1) + "회");
            userInput();
            clear = finding();
            if (clear) {
                break;
            }
            w++;
        }
    }

    public void result() {
        if (clear) {
            System.out.println("Game Clear!!");
        } else {
            System.out.println("Game Over~ ");
        }
    }
}
