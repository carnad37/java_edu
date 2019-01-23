package ex190123;

public class Test04 {
	
	public static void main(String[] args) {
		
		int i = 1, printNum = 3;
		//3,6,9까지 돌고. 
		while(printNum<10)
		{
			System.out.println(printNum);
			i++;
			printNum = i*3;
		}
		
	}

}
