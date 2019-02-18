package work.repeat;

import java.util.Scanner;

public class Work21 {

	public static void main(String[] args) {
		
		//String의 인덱스별로 합을 구해라.
		//charAt()와 Characeter.getNumbervalue()를 이용.
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력해주세요 : ");
		String num = sc.nextLine();
		
		char preNum;
		int x,y,ret,sum=0;
		
		for(x=0;x<num.length();x++)
		{
			preNum = num.charAt(x);
			ret = Character.getNumericValue(preNum);
			sum+=ret;		
		}
		System.out.println(num+"의 합은 "+sum+"이다.");
	}
	
}
