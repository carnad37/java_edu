package ex190111;

public class ex07 {

	public static void main(String[] args) {
		
		//피연산자중 문자열이 있으면 문자열로 결합
		
		String str1="JDK"+6.0;
		String str2=str1+30; 			//문자열 뒤에 숫자가 붙을시 문자열로 대체.
		
		System.out.println(str2);
		
		
		String str3 = "JDK"+3+3.0;		//선두에 문자열이 있으므로 이후 모든 요소는 문자열로 대체
		String str4 = 3 + 3.0 + "JDk" + 4 + 5;	//문자열이 나오기 전에 연산자와 숫자가 있을시 연산후 문자열로 대체
		
		System.out.println(str3);
		System.out.println(str4);
		
		
	}
	
}
