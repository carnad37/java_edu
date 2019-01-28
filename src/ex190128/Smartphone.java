package ex190128;

class SmartSupport {
	int disSize = 60;
	String color = "FHD";
	int bandSpeed = 1000;
	String company = "TJ";
	
	
}
public class Smartphone {

	public static void main(String[] args)
	{
		
		SmartSupport sp1 = new SmartSupport();
		SmartSupport sp2 = new SmartSupport();

		sp2.disSize = 80;
		sp2.color = "HD";
		sp2.bandSpeed = 2000;
		sp2.company = "SS";
		
		
		System.out.println(sp1.disSize);
		System.out.println(sp2.disSize);
		System.out.println("");
		System.out.println(sp1.color);
		System.out.println(sp2.color);
		System.out.println("");
		System.out.println(sp1.bandSpeed);
		System.out.println(sp2.bandSpeed);
		System.out.println("");
		System.out.println(sp1.company);
		System.out.println(sp2.company);
	}
	
}
