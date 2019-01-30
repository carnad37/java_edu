package ex190130.Test02;

public class MainClass {

	public static void main(String[] args) {
		
		int h1 = 120, h2 = 140;
		String c1 = "ikea", c2 = "livat";
		Chair chair1 = new Chair(h1,"c1");
		Chair chair2 = new Chair(h2,"c2");
		
		System.out.println("chair1.height="+chair1.height);
		System.out.println("chair1.company="+chair1.company);
		System.out.println();
		System.out.println("chair2.height="+chair2.height);
		System.out.println("chair2.company="+chair2.company);

	}
	
}
