package work.array;

public class Work40 {
	
	char[] clock = new char[5];
	int threeCount = 0;
	

	
	public static void main(String[] args) {
		
		//전자시계 만들기
		//기본값은 00, 00
		Work40 w40 = new Work40();
		w40.setClock();
		System.out.println(w40.threeCount+"초");

		
	}
	public void setClock()
	{
		for(int i=0;i<clock.length;i++)
		{
			clock[i]='0';
		}
		this.clock[2]=':';
		while(true)
		{
			if(clock[0]=='2'&&clock[1]=='4')
			{
				break;
			}
			else
			{
				System.out.println(this.clock);
			}
			timeCounter();
			for(int k:this.clock)
			{
				if(k=='3')
				{
					threeCount++;
				}
			}
		}
		
	}
	
	public void timeCounter()
	{
		this.clock[4]++;
		if(this.clock[4]>'9')
		{
			this.clock[4]='0';
			this.clock[3]++;
		}
		if(this.clock[3]>'5')
		{
			this.clock[3]='0';
			this.clock[1]++;
		}
		if(this.clock[1]>'9')
		{
			this.clock[1]='0';
			this.clock[0]++;
		}
	}

}
