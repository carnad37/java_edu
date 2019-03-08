package work.array;

import java.util.*;

//숫자 범위 48~57
//영문 범위 97~122, 65~90


public class Test01 {

	public static void main(String[] args) {

		List<Map<String ,String>> lm=   new ArrayList<Map<String ,String>>();

		Map<String ,String> map = new HashMap<String ,String>();
		//1-2 map에 데이터 넣고
		map.put("post", "200132");
		map.put("load", "온의길");
		map.put("addr", "1452");
		//2. map 을 리스트에 넣기
		lm.add(map);
		
		
		String postNum = lm.get(0).get("post");
		System.out.println(postNum);
		
		
//		String a = "1231a";
//		int b = Integer.parseInt(a);
//		String a = "나아아아아앙";
//		String b = "뇨오오옹";
//		System.out.printf("%s%10s%15s",a,b,a);

//		String a = "a";
//		String word = "abcd";
//		int result = word.indexOf(a);
//		System.out.println(result);
//		String b = "e";
//		result = word.indexOf(b);
//		System.out.println(result);
//				
//		
//		char a = '0';//97->122
//		char b = '9';//65->90
//		int k = (int)a;
//		int c = (int)a;
//		System.out.println(c);
//		c = (int)b;
//		System.out.println(c);

//		Scanner scan = new Scanner(System.in);
//		int num = scan.nextInt();
		
		
//		for(int i=0;i<5;i++)
//		{
//
//			int num = scan.nextInt();
//			String anum = scan.nextLine();
//			anum = scan.nextLine();
//
//			System.out.println(num);
//			num = scan.nextInt();
//			scan.reset();
//			System.out.println("입력타임");
//			System.out.println(anum);
//			System.out.println("끝");

//			String word = scan.next();
//			String word = scan.nexLine();
//			System.out.println(word);
//		}
//	}
	}
}
