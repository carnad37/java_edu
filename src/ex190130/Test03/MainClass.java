package ex190130.Test03;

public class MainClass {
	
	public static void main(String[] args) {
		
		int h1 = 150, h2 = 180;
		int a1 =200, a2 = 300;
		String c1 = "c_furniture", c2 = "kfunt";
		Desk ds1 = new Desk(h1,a1,c1);
		Desk ds2 = new Desk(h2,a2,c2
				);
		
		System.out.println("ds1.height="+ds1.height);
		System.out.println("ds1.area="+ds1.area);
		System.out.println("ds1.company="+ds1.company);
		System.out.println();
		System.out.println("ds2.height="+ds2.height);
		System.out.println("ds2.area="+ds2.area);
		System.out.println("ds2.company="+ds2.company);
		
	}

}
