package ex190211.Exception_Ex01;

public class TryCatchFinallyExample {
	
	public static void main(String[] args) {
		
		try
		{
			Class clazz = Class.forName("java.lang.String2");
		}
		catch(ClassNotFoundException e)
		{
			System.out.println("Ŭ������ �������� �ʽ��ϴ�.");
		}
		
		/*
		Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
		Unhandled exception type ClassNotFoundException
		at ex190211.Exception_Ex01.TryCatchFinallyExample.main(TryCatchFinallyExample.java:9)
		*/
	}

}
