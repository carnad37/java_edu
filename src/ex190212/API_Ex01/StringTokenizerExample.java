package ex190212.API_Ex01;

import java.util.StringTokenizer;

public class StringTokenizerExample {

	public static void main(String[] args) {
		
		String text = "ȫ�浿/�̼�ȫ/�ڿ���";
		
		//How1: ��ü ��ū���� ��� for���� ����
		StringTokenizer st = new StringTokenizer(text,"/");
		int countTokens = st.countTokens();
		for(int i=0;i<countTokens;i++)
		{
			
		}
	}
	
}
