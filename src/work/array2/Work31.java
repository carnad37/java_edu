package work.array2;

import work.array2.ArrayMethod;

public class Work31 {

	public static void main(String[] args) {
		
		Work31 w31 = new Work31();
		ArrayMethod am = new ArrayMethod();
		int[] numArray = {-1,1,3,-2,2};
		am.printArray(numArray);
		w31.selectLimitArray(numArray);
		am.printArray(numArray);

	}	
	
	public void selectLimitArray(int[] target)
	{
		int length = target.length;
		for(int i=0;i<length-1;i++)
		{
			for(int j=i+1;j<length;j++)
			{
				if(target[i]<0)
				{
					break;
				}
				else if(target[j]<0)
				{
					//뽑아진 시점 j. 즉  i부터 j사이의 값들을 한자리씩 미뤄준다.
					int value = target[j];
					for(int k=j;k>i;k--)
					{
						target[k]=target[k-1];
					}
					target[i]=value;
					break;
				}
			}
		}
	}
}
