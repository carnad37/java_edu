package ex190114;

public class Ex01 {

	public static void main(String[] args) {
		
		//AND는 모두 true일떄 true
		//OR는 하나라도 true면 true
		//XOR는 OR라 달리, 모두 true면 false리턴.
		//!는 논리부정. 반대값 리턴.
		
		int num = 11;
		System.out.println(((num>=10)&&(num<=122)));
		//num은 11이므로 >=10은 true. <=122은 ture. &&는 AND이므로 모두 ture이니 true리턴.
		
		
	}
	
}
