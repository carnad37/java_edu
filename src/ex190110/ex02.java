package ex190110;

public class ex02 {

	public static void main(String[] args) {
		
		//byte(1)<short(2)<int(4)<long(8)<float(4)<double(8)
		
		byte byteValue = 10;
		int intValue = byteValue;
		System.out.println(intValue);
		
		char charValue = '��';
		intValue = charValue;
		System.out.println("���� �����ڵ�="+intValue);
		
		intValue = 500;
		long longValue = intValue;
		System.out.println(longValue);

		intValue = 200;
		double doubleValue = intValue;
		System.out.println(doubleValue);
		
		//����Ŀ� �־�������, �ڵ���ȯ���� ���� int������ ��ȯ��.
		int intValue3= 10;
		int intValue5 = 4;
		int intValue4 = intValue3/intValue5;
		System.out.println(intValue4);
		//int�� �Ҽ����� �������� ���ϴ� �����̱⿡ 0.5�� �����ȴ�.
		double doubleValue1 = intValue3/intValue5;
		System.out.println(doubleValue1);
		
		
	}
	
}
