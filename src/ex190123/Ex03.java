package ex190123;

public class Ex03 {
	
	public static void main(String[] args) {
		
		for(int i=2;i<10;i++)
		{
			for(int j=1;j<10;j++)
			{
				//행과 열을 바꾸고싶으면 i와 j의 위치 바꾸기
				System.out.print(i+" * "+j+" = " +(i*j));
				System.out.print('\t');
			}
			System.out.println();
		}
		
	}

}
