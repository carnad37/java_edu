package ex190111;

import java.util.Scanner;

public class test02 {

	public static void main(String[] args) {
		
		//�ð�, �� ����
		int count = 60, sec = 0, min = 0;
		
		//��ĳ�� �ҷ���
		Scanner sc = new Scanner(System.in);
		System.out.println("�ʸ� �Է����ֽð� ���͸� ���ּ���: ");
		sec = sc.nextInt();
		
		//��,�� ����
		min=sec/count; //�а��
		sec=sec%count; //�ʰ��
		
		//���
		System.out.println("�Էµ� �ʸ� ȯ���ϸ�,\n"+min+"�� "+sec+"�� �Դϴ�.");
		
	}	
}
