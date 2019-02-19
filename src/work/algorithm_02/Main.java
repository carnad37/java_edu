package work.algorithm_02;

public class Main {

	public static void main(String[] args) {
		
		MyInfo mi = new MyInfo();
		
		String familyName = "jane";
		int currentYear = 2019;
		
		String fullName = mi.getMyName(familyName);
		int resYear = mi.getMyAge(currentYear);
		System.out.println(fullName);
		System.out.println(resYear);
		String adress = mi.getMyAdress();
		System.out.println(adress);
	}
	
}
