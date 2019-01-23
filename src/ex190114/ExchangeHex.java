package ex190114;

public class ExchangeHex {
	
	public static void main(String[] args) {
		
		int i = 20;
		String hexStr = convertToHexString(i);
		
		System.out.println("main: "+hexStr);
		
		
	}

	public static String convertToHexString(int num)
	{
		//1.리턴해줄 변수
		String ret = null;
		//2.변환 명령줄
		ret = Integer.toHexString(num);
		//2-1.확인
		System.out.println("convertToHexString="+ret);
		//3.리턴
		return ret;
				
	}
	
}
