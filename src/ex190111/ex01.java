package ex190111;

public class ex01 {
	
	public static void main(String[] args) {
		
		/*
		변수=(피연산자)(연산자)(피연산자)
		피연산자는 숫자나 변수등이 된다.
		연산자엔 기본적으로 우선순위가 정해져있다. ppt참고.
		다외우면 가독성이 우주로 가기에, ()를 통해 우선 연산시킨다.
		괄호는 짝수로 끝내야한다.(???)->찾아보기		
		
		sum=i++는->증감연산자를 나중에.
		sum=1;
		i=i+1;
		
		sum=++i;->증감연산자 먼저.
		i=i+1;
		sum=i;
		
		=뒤에 ++가 올땐 =보다 먼저 ++처리.
		값(변수) 뒤에 ++가 올 때는 =먼저 처리.
		
		*/
		
		int i = 0, sum = 0;
		//int i = 0;
		//int sum = 0;
		//위나 아래나 결국 같다. 다만 int를 선언할때 한번에 해주면 보기 편하다.
		
		sum = i++;
		//sum = ++i;
		System.out.println(sum);
		System.out.println(i);
		
		//아예 이런 문제를 배제하기위해선.
		
		i = 0;
		sum = 0;
		//i++; //++i;를 하나 똑같다.
		++i;
		sum = i;
		
		System.out.println(sum);
		System.out.println(i);
		
	}
	
	
}
