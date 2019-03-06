package work.array2;

public class Work30 {
	
	public static void main(String[] args) {
		
		//1부터 10000까지 숫자를 서치해서 8들의 갯수를 구한다.
		Work30 w30 = new Work30();
		int res = w30.countingEight(18);
		System.out.println(res);
		
	}
	
	public int changeFormString(String number)
	{
		int length = number.length();
		int count = 0;
		for(int i=0;i<length;i++)
		{
			if(number.charAt(i)=='8')
			{
				count++;
			}
		}
		return count;
		
	}
	public int countingEight(int num)
	{
		int sum = 0;
		for(int i=1;i<=num;i++)
		{
			String data = String.valueOf(i);
			sum += changeFormString(data);
		}
		return sum;
	}
	
}
