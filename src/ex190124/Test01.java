package ex190124;

public class Test01 {

	public static void main(String[] args) {

		String name1 = new String("신용권");
		String name2 = new String("신용권");
		
		//문자열 비교
		
		if(name1.equals(name2))
		{
			System.out.println("두 문자열은 같다.");
		}
		else
		{
			System.out.println("두 문자열은 다르다.");
		}
		
		//객체 비교
		
		if(name1 == name2)
		{
			System.out.println("두 객체는 같다.");
		}
		else
		{
			System.out.println("두 객체는 다르다.");
		}
		
	}

}
