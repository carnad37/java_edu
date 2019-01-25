package ex190125;

public class Test03 {

	public static void main(String[] args) {
		
		int[]arryInt = {1,2,3,4,5,6,7};
		//0번재 인덱스값
		System.out.println(arryInt[0]);
		//5번째 인덱스값
		System.out.println(arryInt[5]);
		//3번째 인덱스값->10
		arryInt[3]=10;
		//6번째 인덱스 값->20
		arryInt[6]=20;
		//배열의 0~5번째 인덱스 값들을 출력
		int i = 0;
		for(i=0;i<6;i++)
		{
			System.out.println("arryInt["+i+"]="+arryInt[i]);
		}
		//배열의 0,2,4,6인덱스의 값들을 출력하시오
		System.out.println("");
		for(i=0;i<arryInt.length;i+=2)
		{
			System.out.println("arryInt["+i+"]="+arryInt[i]);
		}
		//배열의 0,3,6인덱스이 값들을 출력하시오
		System.out.println("");
		for(i=0;i<arryInt.length;i+=3)
		{
			System.out.println("arryInt["+i+"]="+arryInt[i]);
		}
		//배열의 5->3까지 인덱스값들을 출력하시오
		System.out.println("");
		for(i=5;i>=3;i--)
		{
			System.out.println("arryInt["+i+"]="+arryInt[i]);
		}
		//배열의 6->4까지의 인덱스 값 출력
		System.out.println("");
		for(i=6;i>=4;i--)
		{
			System.out.println("arryInt["+i+"]="+arryInt[i]);
		}
		//거꾸로 처음부터 끝까지 출력
		System.out.println("");
		for(i=(arryInt.length-1);i>=0;i--)
		{
			System.out.println("arryInt["+i+"]="+arryInt[i]);
		}
		
	}
	
}
