/*사용자가 입력한 시간에 맞추어 임금을 계산하여 출력하여 주는 프로그램*/

import java.util.Scanner;
public class Pay {

	public static void main(String[] args) {
	int pay;
	int hours;
	Scanner input = new Scanner(System.in);
	
	System.out.println("시간을 입력하세요 : ");
	hours = input.nextInt();
		if(hours>0) {
			pay = hours * 8350;
			System.out.printf("임금은 %d입니다.\n", pay);
		}
		else {
			System.out.println("시간이 잘못 입력되었습니다.");
		}
	}

}
