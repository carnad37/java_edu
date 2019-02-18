package work.repeat;

public class Work18 {

	public static void main(String[] args) {
		
		//(x,y), x+y=6이고 0<x,y<7 은 경우를 모두 출력해라
		//x를 고정하고 y를 늘려가면서 테스트.
		int x,y;
		for(x=1;x<7;x++)
		{
			for(y=1;y<7;y++)
			{
				if((x+y)==6)
				{
					System.out.println("("+x+","+y+")");
				}
			}
		}
		
	}
	
}
