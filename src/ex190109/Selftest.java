package ex190109;

import java.util.Scanner;

public class Selftest {

	public static void main(String[] args) {
			
		int num = 0;
		int i = 0;
		String msg;
		String tar=null;
		String tarn;
		
		Scanner scan = new Scanner(System.in);

		System.out.println("��ȯ�ϰ� ���� ���� �Է����ּ���.");
		System.out.print(": ");
		tarn = scan.nextLine();
		int tar1= Integer.parseInt(tarn);		
		while(i!=1){
			if(i==2) {
				System.out.println("�ٽ� ��ȣ�� �Է��� �ּ���.\n1.2����\n2.16����");
				System.out.print(": ");
				msg = scan.nextLine();
				num=Integer.parseInt(msg);
				i=0;
			}else {
				System.out.println("���Ͻô� ��ȯ ���¸� �������ּ���.\n1.2����\n2.16����");
				System.out.print(": ");
				msg = scan.nextLine();
				num=Integer.parseInt(msg);
			}
			switch(num) {
			case 1:	
				System.out.println("2���� ��ȯ�� �����ϼ̽��ϴ�.");
				tar = Integer.toBinaryString(tar1);
				i=1;
				break;
			case 2:
				System.out.println("16���� ��ȯ�� �����ϼ̽��ϴ�.");
				tar = Integer.toHexString(tar1);
				i=1;
				break;
			default :
				System.out.println("�߸��Է��ϼ̽��ϴ�.");
				i=2;
				break;		
			}
			
		}
		
		System.out.println("��� ���� "+tar+"�Դϴ�.");
		
	}
	
}
