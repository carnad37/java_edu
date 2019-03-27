package work.array;

import java.util.*;

//숫자 범위 48~57
//영문 범위 97~122, 65~90


public class Test01<E> {

	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//
//		// 국어, 영어, 수학 점수를 받아서 총점,평균,학점 구하기
//		while (true) {
//			String name = "";
//			int kor, eng, math = 0;
//
//			System.out.print("이름 :");
//			name = scan.next();
//
//			System.out.print("국어점수 입력:");
//			kor = scan.nextInt();
//
//			System.out.print("영어점수 입력:");
//			eng = scan.nextInt();
//
//			System.out.print("수학점수 입력:");
//			math = scan.nextInt();
//			
//			// 총점, 평균, 학점 구하기
//			int sum = kor + eng + math;
//			double avg = (int) ((sum / 3.0) * 10) / 10.0;
//
//			String hak = "";
//			if (avg >= 90) {
//				hak = "A 학점";
//			} else if (avg >= 80) {
//				hak = "B 학점";
//			} else if (avg >= 70) {
//				hak = "C 학점";
//			} else if (avg >= 60) {
//				hak = "D 학점";
//			} else {
//				hak = "F 학점";
//			}
//
//			System.out.println("***시험결과***");
//			System.out.println("성명 : " + name);
//			System.out.println("총점 : " + sum);
//			System.out.println("평균 : " + avg);
//			System.out.println("학점 : " + hak);
//			System.out.println("**********");
//
//			System.out.println("Again? (Y/N) : ");
//			String msg = scan.next();
//			if (msg.equalsIgnoreCase("n"))
//				break;
//
//		}
//
//		System.out.println("수고 하셨습니다.");

//		List<String> nn = new ArrayList<String>();
//		nn.add("ㅇㅇ");
//		String dd = nn.set(0, "ㄴㄴ");
//		System.out.println(dd);
//		System.out.println(nn.get(0));
//		Set<Integer> target = new HashSet<Integer>();
//		target.add(2);
//		target.add(2);
//		System.out.println(target.size());

		Map<String,String> map = new HashMap<String,String>();
		map.put("dd", "ddd");
		map.put("ee", "eee");
		Set<Map.Entry<String,String>> aa = map.entrySet();
		for (Map.Entry<String, String> entry : aa)
		{
			
		}
		
//		Set<Integer> aa = new HashSet<Integer>();
//		boolean res = aa.add(1);
//		System.out.println(res);
//		res = aa.add(1);
//		System.out.println(res);
	}
	
	public E[] gee()
	{
		Object okdok = new Object[10];
		E[] e = (E[])okdok;
		return e;
	}

}
