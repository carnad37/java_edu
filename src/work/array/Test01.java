package work.array;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		
//		char a = 'z';//97->122
//		char b = 'Z';//65->90
//		int c = (int)a;
//		System.out.println(c);
//		c = (int)b;
//		System.out.println(c);

		Scanner scan = new Scanner(System.in);
		
		for(int i=0;i<5;i++)
		{
			int num = scan.nextInt();
			System.out.println(num);
			num = scan.nextInt();
			scan.reset();
			System.out.println("ÁØºñ");
			num = scan.nextInt();
			System.out.println(num);
			System.out.println("³¡");

//			String word = scan.next();
////			String word = scan.nexLine();
//			System.out.println(word);
		}
	}
	
	
}
