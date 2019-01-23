package ex190114;

public class exmethod {

	public static void main(String[] args) {
		
		//main 메소드 분석.
		//public은 기본적으로 들어간다. static은 들어갈때도 들어가지 않을때도 있다.
		//void는 메소드 수행결과를 리턴하지 않겠다. 이외엔 리턴되는 타입(double, int, String 등등)을 쓴다. main은 메소드명.
		//String[] args는 선언..? 매개변수는 ,로 구분하며 여러개가 들어갈 수 있다.
		
		//리턴타입 메소드명(매개변수)
		//{
		//	문장;
		//	return 변수;
		//}
		
		int a = 1, b = 3;
		int sum = a+b;
		String str= Integer.toHexString(sum);
		System.out.println("main()="+sum);
		System.out.println("main()="+str);
		//메소드 호출
		//int ret= add(a,b);
		//System.out.println(ret);
		//메소드 호출 방법
		//1. 메소드명(ex: add)
		//2. 매개 변수를 타입과 갯수(ex: a, b)
		//3. 리턴값을 저장, 당연히 타입이 같아야함.(ex: int ret=)
		
		//리턴값이 없는경우.
		printText(sum);
		//매개변수가 없는 경우. 리턴값은 저장됨.
		int ret = staticPrintmsg();
		
		
	}
	//메소드 구현부
	public static int add(int x, int y)
	{
		
		int sum = x+y;
		return sum;
		
	}
	
	//메소드는 유지보수에 편리.1
	//Scanner sc = new Scanner(System.in);
	//도 역시 비슷한 형식.(아마 상속?)
	
	//return;은 메소드를 끝내고 싶을때도 사용.
	
	//매개변수는 있지만, 리턴값이 없는 메소드.
	public static void printText(int sum)
	{
		
		System.out.println("printText="+sum);
		
	}
	
	//리턴값은 있고, 매개변수가 없는 메소드.
	public static int staticPrintmsg()
	{
		
		System.out.println("---------------------");
		int ret=0;
		return ret;
				
	}
	
	
}
