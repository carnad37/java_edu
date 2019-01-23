package ex190123;

public class Test06 {
	public static void main(String[] args) {
		//두개의 값 사이에서 평균을 구해라(for문)
		int start = 3, end = 13, count =0, sum = 0, avg = 0;
		end++;
		for(;start<end;start++)
		{
			sum+=start;
			count++;
			//또는 카운트는 end-start도 된다.
		}
		avg = sum/count;
		System.out.println("Avg : "+avg);
	}
}
