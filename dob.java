/*��ø if���� ����Ͽ� ����� ������ ���α׷�*/

import java.util.Scanner;
public class dob {

	public static void main(String[] args) {
	
		int score;
		Scanner input = new Scanner(System.in);
		System.out.println("������ �Է��� �ּ��� : ");
		score = input.nextInt();
		
		if(score>=30 && score<=100) {
			if(score>=90)
				System.out.println("A");
			else if(score>=80)
				System.out.println("B");
			else
				System.out.println("C");
		}

	}

}
