package ex190123;

public class Ex04 {

	public static void main(String[] args) {
		
		//Label쓰는법
		//이중이상의 반복문에서 한번에 빠져나갈때, 사용.
		//빠져나가고 싶은 반복문앞에 (라벨명): for(or while) 을 입력
		//break (라벨명);으로 시작점 설정가능.
		exit:	for(int i=2;i<10;i++)
		{
			for(int j=1;j<10;j++)
			{
				//행과 열을 바꾸고싶으면 i와 j의 위치 바꾸기
				System.out.print(i+" * "+j+" = " +(i*j));
				System.out.print('\t');
				if(i==4&&j==4)
				{
					break exit;
				}
			}
			System.out.println();
		}
		
		
	}
	
}
