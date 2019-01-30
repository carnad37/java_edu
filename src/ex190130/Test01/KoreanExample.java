package ex190130.Test01;

public class KoreanExample {
	
	public static void main(String[] args) {
		
		Korean k1 = new Korean();
		System.out.println("k1.name : "+k1.name);
		System.out.println("k1.ssn : "+k1.ssn);

		Korean k2 = new Korean("±èÀÚ¹Ù","930525-0654321");
		System.out.println("k2.name : "+k2.name);
		System.out.println("k2.ssn : "+k2.ssn);
		
	}

}
