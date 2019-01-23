package ex190116;

public class Test02 {

	public static void main(String[] args) {
		
		int age= 30;
		boolean adult = false;
		adult = (age <= 19) ? false : true;
		System.out.println(adult);
		
		if(age<=19)
		{
			adult=false;
		}
		else
		{
			adult=true;
		}
		
		
	}
	
}
