package ex190124;

public class Ex05 {

	public static void main(String[] args) {
		//scores배열에 값들을 입력
		int[] scores = {83, 90, 87};
		//각각의 값들을 출력
		System.out.println("scores[0] : "+scores[0]);
		System.out.println("scores[1] : "+scores[1]);
		System.out.println("scores[2] : "+scores[2]);
		//반복문을 통해 각각의 값들의 합을 계산
		int sum = 0, i = 0;
		for(i=0;i<3;i++)
		{
			sum+=scores[i];
		}
		//총합과 평균을 출력
		System.out.println("총합: "+sum);
		double avg =(double)sum/3;
		System.out.println("평균: "+avg);
	}
	
}
