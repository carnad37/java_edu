package ex190212.API_Ex01;

import java.util.StringTokenizer;

public class StringTokenizerExample {

	public static void main(String[] args) {
		
		String text = "홍길동/이수홍/박연수";
		
		//How1: 전체 토큰수를 얻어 for으로 루프
		StringTokenizer st = new StringTokenizer(text,"/");
		int countTokens = st.countTokens();
		for(int i=0;i<countTokens;i++)
		{
			
		}
	}
	
}
