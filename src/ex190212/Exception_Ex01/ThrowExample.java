package ex190212.Exception_Ex01;

public class ThrowExample {

	public static void main(String[] args) {
		
		try
		{
			findClass();
		}
		catch(ClassNotFoundException e)
		{
			System.out.println("Ŭ������ �������� �ʽ��ϴ�.");
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
//			System.out.println("Ŭ������ �������� �ʽ��ϴ�.");
//		}
//	}
	
	
}
