/*if-else���� �̿��� �� ���ڸ� �Է¹޾Ƽ� ū ���� ~�� ũ�� ������ ������ִ� ���α׷�*/

import java.util.Scanner;
public class Max {

	public static void main(String[] args) {
		
		int x;
		int y;
		Scanner input = new Scanner(System.in);
		
		System.out.println("x�� �Է��ϼ��� : ");
		x = input.nextInt();
		System.out.println("y�� �Է��ϼ��� : ");
		y = input.nextInt();
		
		if(x>y)
			System.out.println("x�� ũ��");
		else
			System.out.println("Y�� ũ��");
	}

}
	