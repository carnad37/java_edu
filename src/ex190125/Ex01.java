package ex190125;

public class Ex01 {

	public static void main(String[] args)
	{
		
		//배열엔 기본 참조타입다 사용가능.
		//배열길이
		//배열변수.length;->int리턴
		int[]score = {83,90,87};

		int sum = 0;
		
		//일반 for문
//		for(int i = 0; i<score.length;i++)
//		{
//			sum += score[i];
//		}
		
		//for-each문으로 변환	
		for(int k : score)	//배열의 요소값을 대입받을 변수는 반드시 ()내에서 선언.
		{
			sum += k;
		}
		
		System.out.println("총합 : "+sum);
		double avg = (double)sum/score.length;
		System.out.println("평균 : "+avg);
		
	}
	
}
