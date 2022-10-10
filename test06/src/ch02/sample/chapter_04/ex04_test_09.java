package ch02.sample.chapter_04;


//[4-9] int타입의 변수 num 이 있을 때, 각 자리의 합을 더한 결과를 출력하는 코드를 완 성하라. 만일 변수 num의 값이 12345라면, ‘1+2+3+4+5’의 결과인 15를 출력하라. (1)에 알맞은 코드를 넣으시오.
//[주의] 문자열로 변환하지 말고 숫자로만 처리해야 한다.
public class ex04_test_09 {
    public static void main(String[] args) {
        int num = 12345;
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        System.out.println("sum=" + sum);
    }
}

/*
문제4-7에서처럼 문자열에서 charAt(int i)를 이용해서 문자를 숫자로 변환하는 것보다 숫자에서 각 자리수의 숫자를 하나씩 뽑아내는 것은 더 어렵다.
하지만, 숫자의 마지막 자리를 어떻게 뽑아내는지만 알아내면 나머지는 쉽게 해결된다.
방법은 의외로 간단하다 아래와 같이 숫자를 10으로 반복해서 나눠가면서, 10으로 나머 지 연산을 하면 일의 자리를 얻어낼 수 있다.
num    num%10
12345   5
1234    4
123     3
12      2
1       1
이 값들을 더하기만하면 변수 num에 저장된 숫자의 각 자리수를 모두 더한 값을 구할 수 있다.
 */
