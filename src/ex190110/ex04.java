package ex190110;

public class ex04 {

	public static void main(String[] args) {
		
		int intValue = 44032;
		char charValue = (char)intValue;
		System.out.println(charValue);
		
		long longValue = 500;
		intValue = (int)longValue;
		System.out.println(intValue);
		
		double doubleValue = 3.14;
		intValue = (int)doubleValue;
		System.out.println(intValue);
		
		double doubleValue1 = 3.145632;
		long longValue1 = (long)doubleValue1;
		doubleValue1 = (double)longValue1;
		
		byte byte1 = 1;
		byte byte2 = 2;
		byte byte3 = (byte)(byte1+byte2);
		
		double i=1.3, j=2.2;
		double k = i+j;
		System.out.println(k);
		
		
		
	}
	
}
