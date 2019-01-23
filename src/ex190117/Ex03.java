package ex190117;

public class Ex03 {
	public static void main(String[] args) {
		
		//switch문은 case에 맞는 순간부터, 수행시작.
		//break;를 만나기 전까지 계속 시행된다.
		char grade = 'B';
		
		switch(grade)
		{
			case 'A':
			case 'a':
				System.out.println("우수 회원입니다.");
				break;
			case 'B':
			case 'b':
				System.out.println("일반 회원입니다.");
				break;
			default:
				System.out.println("손님입니다.");
		}
	}
}
