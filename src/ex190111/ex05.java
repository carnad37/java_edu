package ex190111;


//1.스캐너 클래스의 패키지를 import해온다. import java.util.Scanner;
import java.util.Scanner;

public class ex05 {

	public static void main(String[] args) {

		//2. 스캐너 클래스의 객체를 생성. 출력할때는 System.out이였듯, 받아들일때는 System.in
		Scanner sc = new Scanner(System.in);
		//3. 생성된 객체를 이용 키보드로부터 입력을 받아서 변수에 저장. 입력시까지 대기.
		sc.nextInt();
		//정수값만 입력받을 수 있다.
		//문자열의 경우는,
		//String inputStr = sc.next();또는 sc.nextline();
		//실수의 경우는,
		//double inputDouble = sc.nextDouble();
		int inputNum = sc.nextInt();
	
	}
}
