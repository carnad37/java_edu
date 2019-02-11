package ex190211.Exception_Ex01;

public class ArrayIndexOutOfBoundsExceptionExample {
	
	public static void main(String[] args) {
		
		String[] input = {"a"};
		
		String data1 = input[0];
//		String data2 = input[1];
		//이 코드에서 예외처리가 되었기에 아래의 System.out.println()은 실행되지 않는다.
		System.out.println("input[0]"+data1);
		
		/*
		Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 1
		at ex190211.Exception_Ex01.ArrayIndexOutOfBoundsExceptionExample.main(ArrayIndexOutOfBoundsExceptionExample.java:10)
		*/
		
	}

}
