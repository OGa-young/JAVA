/*�ΰ��� ���ڸ� �Է¹޾Ƽ� �������� ����ϴ� ���α׷�*/

import java.util.Scanner;	//main �޼ҵ忡�� ������ ����

public class Add {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);//����ڷκ��� �Է��� �ޱ� ���� Scanner��ü�� ���� 
			int x;	//��������
			int y;
			int sum;
			
			System.out.print("ù���� ���ڸ� �Է��ϼ��� : ");	//�Է� �ȳ� ���
			x = input.nextInt();	//ù��° ���ڸ� ����
			System.out.print("�ι�° ���ڸ� �Է��ϼ��� : ");
			y = input.nextInt();
			
			sum = x/y;
			System.out.println("������ =" + x/y);
	}
}
