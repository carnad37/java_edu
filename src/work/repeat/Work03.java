package work.repeat;
import java.util.Scanner;

public class Work03 {
	
	public static void main(String[] args) {
		
		//i를 입력받아 3,2,1,1,2,3순으로 출력
		//문자열은 추가는되지 뺄수는 없다.
		//첫번째는 역행하는 반복문. 3,2,1순으로 횟수출력
		//두번째는 기존 그대로 출력.
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력해주세요: ");
		int num = sc.nextInt();
		int i = 0, j = 0;
		String star = "*";
		//위의 감소하는 별
		for(j=num;j>0;j--)
		{
			for(i=0;i<j;i++)
			{
				System.out.print(star);
			}
			System.out.println("");
		}
		for(j=0;j<num;j++)
		{
			for(i=0;i<j+1;i++)
			{
				System.out.print(star);
			}
			System.out.println("");
		}
	
	}

}
