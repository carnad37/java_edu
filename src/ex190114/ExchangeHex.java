package ex190114;

public class ExchangeHex {
	
	public static void main(String[] args) {
		
		int i = 20;
		String hexStr = convertToHexString(i);
		
		System.out.println("main: "+hexStr);
		
		
	}

	public static String convertToHexString(int num)
	{
		//1.�������� ����
		String ret = null;
		//2.��ȯ �����
		ret = Integer.toHexString(num);
		//2-1.Ȯ��
		System.out.println("convertToHexString="+ret);
		//3.����
		return ret;
				
	}
	
}
