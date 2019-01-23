package ex190110;

public class ex05 {

	public static void main(String[] args) {
		
		double i=2.9, j=1.8;
		double resd=0;
		int resi=0;
		resd=(int)i+j;				//2+1.8
		System.out.println(resd);
		resi=(int)(i+j);			//int 4.7=>4
		System.out.println(resi);
		resi=(int)i+(int)j;			//2+1=3
		System.out.println(resi);		
	
	}	
	
}
