package ex190125;

public class Test02 {

	public static void main(String[] args) {
		
		String strArray[] = {"���","��","�ٳ���","ü��","����","����"};
		String strResult = "����";
		for(String k : strArray)
		{
			strResult += k;
		}
		System.out.println(strResult);
		
	}
	
}
