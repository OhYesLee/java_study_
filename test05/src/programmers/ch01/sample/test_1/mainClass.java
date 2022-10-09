package programmers.ch01.sample.test_1;

import sample.test_1.Baseball;

public class mainClass {
    public static void main(String[] args) {
        Baseball ball = new Baseball();
        ball.init();
        ball.loop();
        ball.result();
    }
}
