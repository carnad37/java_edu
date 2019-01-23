package ex190114;

public class Test03 {

	public static void main(String[] args) {
		
		int x = 20;
		System.out.println("printValue="+x);
		printHexString(x);
		
	}
	
	public static void printHexString(int num) {
		
		String hexStr = Integer.toHexString(num);
		System.out.println("convertHexString="+hexStr);
		
	}
	
}
