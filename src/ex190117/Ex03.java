package ex190117;

public class Ex03 {
	public static void main(String[] args) {
		
		//switch���� case�� �´� ��������, �������.
		//break;�� ������ ������ ��� ����ȴ�.
		char grade = 'B';
		
		switch(grade)
		{
			case 'A':
			case 'a':
				System.out.println("��� ȸ���Դϴ�.");
				break;
			case 'B':
			case 'b':
				System.out.println("�Ϲ� ȸ���Դϴ�.");
				break;
			default:
				System.out.println("�մ��Դϴ�.");
		}
	}
}
