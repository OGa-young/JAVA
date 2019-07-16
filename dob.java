/*중첩 if문을 사용하여 등급을 나누는 프로그램*/

import java.util.Scanner;
public class dob {

	public static void main(String[] args) {
	
		int score;
		Scanner input = new Scanner(System.in);
		System.out.println("성적을 입력해 주세요 : ");
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
