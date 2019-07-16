/*if-else문을 이용하 두 숫자를 입력받아서 큰 수를 ~가 크다 식으로 출력해주는 프로그램*/

import java.util.Scanner;
public class Max {

	public static void main(String[] args) {
		
		int x;
		int y;
		Scanner input = new Scanner(System.in);
		
		System.out.println("x를 입력하세요 : ");
		x = input.nextInt();
		System.out.println("y를 입력하세요 : ");
		y = input.nextInt();
		
		if(x>y)
			System.out.println("x가 크다");
		else
			System.out.println("Y가 크다");
	}

}
	