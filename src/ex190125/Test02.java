package ex190125;

public class Test02 {

	public static void main(String[] args) {
		
		String strArray[] = {"사과","배","바나나","체리","딸기","포도"};
		String strResult = "수박";
		for(String k : strArray)
		{
			strResult += k;
		}
		System.out.println(strResult);
		
	}
	
}
