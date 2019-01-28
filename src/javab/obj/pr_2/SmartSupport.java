package javab.obj.pr_2;

public class SmartSupport {
	
	public static void main(String[] args) {
		
		Smartphone sp1 = new Smartphone();
		Smartphone sp2 = new Smartphone();
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
