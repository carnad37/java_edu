package work.repeat;

public class Work20 {

	public static void main(String[] args) {
		
		//소수찾기
		//다만 소수는 자신보다 큰수로 나눌 필요가 없다.
		//자신보다 작은 자연수로 나눠준다.
		int x,y,ret=0;
		
		for(x=1;x<=100;x++)
		{
			ret = 0;
			for(y=2;y<=x;y++)
			{
				if(x%y==0)
				{
					ret++;
				}
			}
			if(ret==1)
			{
				System.out.println(x+"는 소수이다.");
			}
		}	
	}
}
