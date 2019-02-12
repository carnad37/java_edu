package ex190212.Exception_Ex01;

public class ThrowExample {

	public static void main(String[] args) {
		
		try
		{
			findClass();
		}
		catch(ClassNotFoundException e)
		{
			System.out.println("클래스가 존재하지 않습니다.");
		}
	}
	public static void findClass() throws ClassNotFoundException
	{
		Class clazz = Class.forName("java.lang.String2");
	}
	
	
//	public static void main(String[] args) {
//		
//		findClass();
//		
//	}
//	public static void findClass()
//	{
//		try
//		{
//			Class clazz = Class.forName("java.lang.String2");
//		}
//		catch(ClassNotFoundException e)
//		{
//			System.out.println("클래스가 존재하지 않습니다.");
//		}
//	}
	
	
}
