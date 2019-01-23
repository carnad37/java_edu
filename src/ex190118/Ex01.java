package ex190118;

public class Ex01 {

	public static void main(String[] args)
	{
		String position = "과장";
		//if문은 String.eqauls(string)으로 비교하지만, switch는 case에 직접 기입.
		switch(position)
		{
			case "부장" :
				System.out.println("700 만원");
				break;
			case "과장" :
				System.out.println("500 만원");
				break;
			default:
				System.out.println("300 만원");
		}
		
	}
	
}
