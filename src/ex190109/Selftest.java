package ex190109;

import java.util.Scanner;

public class Selftest {

	public static void main(String[] args) {
			
		int num = 0;
		int i = 0;
		String msg;
		String tar=null;
		String tarn;
		
		Scanner scan = new Scanner(System.in);

		System.out.println("전환하고 싶은 수를 입력해주세요.");
		System.out.print(": ");
		tarn = scan.nextLine();
		int tar1= Integer.parseInt(tarn);		
		while(i!=1){
			if(i==2) {
				System.out.println("다시 번호를 입력해 주세요.\n1.2진수\n2.16진수");
				System.out.print(": ");
				msg = scan.nextLine();
				num=Integer.parseInt(msg);
				i=0;
			}else {
				System.out.println("원하시는 변환 형태를 선택해주세요.\n1.2진수\n2.16진수");
				System.out.print(": ");
				msg = scan.nextLine();
				num=Integer.parseInt(msg);
			}
			switch(num) {
			case 1:	
				System.out.println("2진수 변환을 선택하셨습니다.");
				tar = Integer.toBinaryString(tar1);
				i=1;
				break;
			case 2:
				System.out.println("16진수 변환을 선택하셨습니다.");
				tar = Integer.toHexString(tar1);
				i=1;
				break;
			default :
				System.out.println("잘못입력하셨습니다.");
				i=2;
				break;		
			}
			
		}
		
		System.out.println("결과 값은 "+tar+"입니다.");
		
	}
	
}
