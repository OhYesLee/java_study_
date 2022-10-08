package ch02.sample.chapter_02;

class Ex2_8 {
	public static void main(String args[]) {
		int x = 10, y = 5;   // int x = 10; int y = 5;�� �� �ٷ�
		System.out.println("x="+x); 
		System.out.println("y="+y); 

		int tmp = x;    // 1. x�� ���� tmp�� ����
		x = y;          // 2. y�� ���� x�� ����
 		y = tmp;        // 3. tmp�� ����� ���� y�� ����
		System.out.println("x="+x); 
		System.out.println("y="+y); 
	}
}