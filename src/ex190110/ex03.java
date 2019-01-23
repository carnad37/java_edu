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
		System.out.println("유니코드="+intValue1);
		System.out.println("출력문자="+(char)intValue2);
		
		//연산식에 넣어졌을시, 자동변환으로 인해 int형으로 변환됨.
		int intValue3= 10;
		int intValue4 = intValue3/4;
		System.out.println(intValue4);
		//int는 소숫점을 포함하지 못하는 정수이기에 0.5가 생략된다.
		//int intValue6 = 10 / 4.0;
		double doubleValue1 = intValue3/4.0;
		System.out.println(doubleValue1);
		
	}
	
}
