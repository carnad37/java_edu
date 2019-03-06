package work.array2;

public class Work29 {
	
	public static void main(String[] args) {
		
		
		
	}
	
	
	public int calGenerator(int target)
	{
		String num = String.valueOf(target);
		int length = num.length();
//		char[] targetArray = new char[length];
		int sum = 0;
		for(int i=0;i<length;i++)
		{
			sum += ((int)num.charAt(i) - 48);
		}
		sum+=target;
		return sum;		
	}
	
	//배열 크기를 늘려주는 메소드
	//선언만한 배열을 매개변수로 넣어줌
	//함수내에서 선언
	//기본 10칸.
	//늘어날때는

}
