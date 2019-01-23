package ex190118;

import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("직급을 입력해주세요: ");
		String nameType = sc.next();
		/*
		switch(nameType)
		{
			case "부장":
				System.out.println("3층 휴게실로 가세요.");
				break;
			case "과장":
				System.out.println("2층 회의실로 가세요.");
				break;
			case "사원":
				System.out.println("그냥 거기서 기다리세요.");
				break;
			default:
				System.out.println("직급이 잘못 입력되었습니다.");
		}
		*/
		if(nameType.equals("부장"))
		{
			System.out.println("3층 휴게실로 가세요.");
		}
		else if(nameType.equals("과장"))
		{
			System.out.println("2층 회의실로 가세요.");
		}
		else if(nameType.equals("부장"))
		{
			System.out.println("그냥 거기서 기다리세요.");
		}
		
	}
	
}
