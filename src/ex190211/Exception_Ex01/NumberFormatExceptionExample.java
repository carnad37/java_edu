package ex190211.Exception_Ex01;

public class NumberFormatExceptionExample {

	public static void main(String[] args) {
		String data1 = "100";
		String data2 = "a100";
		try
		{
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);
			int result = value1 + value2;
			System.out.println(data1+"+"+data2+"="+result);
		}
		catch(NumberFormatException e)
		{
			System.out.println("숫자로 변환할 수 없습니다.");
		}
		finally
		{
			System.out.println("다시 실행해 주세요.");
		}
		

		
		/*
		Exception in thread "main" java.lang.NumberFormatException: For input string: "a100"
		at java.lang.NumberFormatException.forInputString(Unknown Source)
		at java.lang.Integer.parseInt(Unknown Source)
		at java.lang.Integer.parseInt(Unknown Source)
		at ex190211.Exception_Ex01.NumberFormatExceptionExample.main(NumberFormatExceptionExample.java:10)
		 */
		
		
	}
	
}
