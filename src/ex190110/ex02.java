package ex190110;

public class ex02 {

	public static void main(String[] args) {
		
		//byte(1)<short(2)<int(4)<long(8)<float(4)<double(8)
		
		byte byteValue = 10;
		int intValue = byteValue;
		System.out.println(intValue);
		
		char charValue = '가';
		intValue = charValue;
		System.out.println("가의 유니코드="+intValue);
		
		intValue = 500;
		long longValue = intValue;
		System.out.println(longValue);

		intValue = 200;
		double doubleValue = intValue;
		System.out.println(doubleValue);
		
		//연산식에 넣어졌을시, 자동변환으로 인해 int형으로 변환됨.
		int intValue3= 10;
		int intValue5 = 4;
		int intValue4 = intValue3/intValue5;
		System.out.println(intValue4);
		//int는 소숫점을 포함하지 못하는 정수이기에 0.5가 생략된다.
		double doubleValue1 = intValue3/intValue5;
		System.out.println(doubleValue1);
		
		
	}
	
}
