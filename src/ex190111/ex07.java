package ex190111;

public class ex07 {

	public static void main(String[] args) {
		
		//�ǿ������� ���ڿ��� ������ ���ڿ��� ����
		
		String str1="JDK"+6.0;
		String str2=str1+30; 			//���ڿ� �ڿ� ���ڰ� ������ ���ڿ��� ��ü.
		
		System.out.println(str2);
		
		
		String str3 = "JDK"+3+3.0;		//���ο� ���ڿ��� �����Ƿ� ���� ��� ��Ҵ� ���ڿ��� ��ü
		String str4 = 3 + 3.0 + "JDk" + 4 + 5;	//���ڿ��� ������ ���� �����ڿ� ���ڰ� ������ ������ ���ڿ��� ��ü
		
		System.out.println(str3);
		System.out.println(str4);
		
		
	}
	
}
