/*두개의 숫자를 입력받아서 나눈값을 출력하는 프로그램*/

import java.util.Scanner;	//main 메소드에서 실행이 시작

public class Add {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);//사용자로부터 입력을 받기 위해 Scanner객체를 생성 
			int x;	//변수선언
			int y;
			int sum;
			
			System.out.print("첫번쨰 숫자를 입력하세요 : ");	//입력 안내 출력
			x = input.nextInt();	//첫번째 숫자를 읽음
			System.out.print("두번째 숫자를 입력하세요 : ");
			y = input.nextInt();
			
			sum = x/y;
			System.out.println("나눈값 =" + x/y);
	}
}
