package ex190121;

import java.util.Scanner;

public class Sum00 {
	
	//nextLine의 원리와 문제.
	//보통 1을 치고 enter를 입력했을때.
	//메모리에 기록되는건 1+(줄바꿈:\n)+(커서를 처음으로:\r) : 1\n\r인데
	//nextLine을 nextInt바로 뒤에 쓰게되면
	//num = sc.nextInt();
	//str = sc.nextLine();
	//( 1 ) + 이후의 (\n)+(\r)을 입력했다고 인식한다.
	//그리되면 num만 입력했을시인데, 다음줄이 자동으로 입력되며 끝이난다.
	//붙여쓰지 말던가 next();를 쓰자.
	//궁금하면 직접쳐보자.
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		//12 12 입력시엔 12 12가 출력
		//String str = sc.next();
		//12 12 입력시엔 12만 출력.(띄어쓰기랑 줄바꿈 모두 인식)
		System.out.println(str);
		
		//처리장치 사이에 정보 누락을 방지하기위한 큐(?)라는 정보 저장공간이 있는데.
		// | | | | | 각각의 칸마다 데이타가 저장되고 입력받는 장치에서 정보를 가져가면 당겨지는 식의
		//누적되는 형태로 저장된다.
		//nextLine같은 경우, /r과 /n을 제외하지 않기에
		///r/n을 데이터를 큐에서 입력받은 것으로 인식하게 된다.
	}
}
