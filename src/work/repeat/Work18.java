package work.repeat;

public class Work18 {

	public static void main(String[] args) {
		
		//(x,y), x+y=6�̰� 0<x,y<7 �� ��츦 ��� ����ض�
		//x�� �����ϰ� y�� �÷����鼭 �׽�Ʈ.
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
