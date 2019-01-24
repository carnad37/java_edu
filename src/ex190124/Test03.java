package ex190124;

public class Test03 {

	public static void main(String[] args) {
		
		//null로 배열부터 생성
		int[] a = new int[3];		
		
		int i = 0, val = 0;
		
		for(i=0;i<3;i++)
		{
			val = (2*(i+1));
			a[i] = val;
		}
		for(i=0;i<3;i++)
		{
			System.out.println("a["+i+"] = "+a[i]);
		}
		
	}
	
}
