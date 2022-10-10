package programmers.ch01.sample.chapter_03;

public class ex03_test3_4 {
    public static void main(String[] args) {
        int numOfApples = 123; // 사과의 개수
        int sizeOfBucket = 10; // 바구니의 크기(바구니에 담을 수 있는 사과의 개수)
        int numOfBucket = (numOfApples/sizeOfBucket + (numOfApples%sizeOfBucket > 0 ? 1 : 0)); // 모둔사과를 담는데 필요한 바구니의 수

        System.out.println("필요한 바구니의 수 : " + numOfBucket);

        //[해설] 사과의 개수(numOfApples)를 바구니의 크기(sizeOfBucket)으로 나눗셈연산(/)을 하면 사과를 담는데 필요한 바구니의 수(numOfBucket)를 구할 수 있다.
        // 정수간의 나눗셈 연산의 특징은 반올림을 하지 않고 버림을 한다는 것이다. 예를 들어 125/10의 결과는 13 이 아니라 12가 된다.
        // 게다가 int와 int간의 이항연산결과는 int이기 때문에, 12.5와 같 은 실수값 결과가 나오지 않는다.
        //그리고 사과의 개수(numOfApples)를 바구니의 크기(sizeOfBucket)으로 나눴을 때 나머지 가 있으면 하나의 바구니가 더 필요하다.
        // 그래서 나머지 연산자(%)를 이용해서 나눗셈연 산에서 나머지가 발생하는지 확인해서, 나머지가 발생하면 바구니의 개수(numOfBucket)에 1을 더해줘야 한다.


    }
}
