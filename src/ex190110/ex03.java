package ex190110;

public class ex03 {

	public static void main(String[] args) {
	
		byte byteValue1 = 10;
		byte byteValue2 = 20;
		//byte byteValue3 = byteValue1+byteValue2;
		int intValue1 = byteValue1+byteValue2;
		System.out.println(intValue1);
		
		char charValue1 = 'A';
		char charValue2 = 1;
		//char charValue3 = charValue1+charValue2;
		int intValue2 = charValue1+charValue2;
		System.out.println("�����ڵ�="+intValue1);
		System.out.println("��¹���="+(char)intValue2);
		
		//����Ŀ� �־�������, �ڵ���ȯ���� ���� int������ ��ȯ��.
		int intValue3= 10;
		int intValue4 = intValue3/4;
		System.out.println(intValue4);
		//int�� �Ҽ����� �������� ���ϴ� �����̱⿡ 0.5�� �����ȴ�.
		//int intValue6 = 10 / 4.0;
		double doubleValue1 = intValue3/4.0;
		System.out.println(doubleValue1);
		
	}
	
}
