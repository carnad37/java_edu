package work.repeat;

public class Work20 {

	public static void main(String[] args) {
		
		//�Ҽ�ã��
		//�ٸ� �Ҽ��� �ڽź��� ū���� ���� �ʿ䰡 ����.
		//�ڽź��� ���� �ڿ����� �����ش�.
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
				System.out.println(x+"�� �Ҽ��̴�.");
			}
		}	
	}
}
