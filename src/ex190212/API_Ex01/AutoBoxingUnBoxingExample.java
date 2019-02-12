package ex190212.API_Ex01;

public class AutoBoxingUnBoxingExample {

	public static void main(String[] args) {
		
		//자동 Boxing
		Integer obj = 100;
		System.out.println("value: "+obj.intValue());
		
		Integer it01 = new Integer(100);
		System.out.println("value: "+it01.intValue());
		
		Integer it02 = Integer.valueOf("1000");
		System.out.println("value: "+it02.intValue());
		
		//대입시 자동 Unboxing
		int value01 = obj;
		int value02 = it01;
		int value03 = it02;
		System.out.println("value: "+value01);
		System.out.println("value: "+value02);
		System.out.println("value: "+value03);
		
		//연산시 자동 Unboxing
		int result = obj+100;
		System.out.println("result: "+result);
		
		
	}
	
}
