package ex190123;

public class Ex05 {

	public static void main(String[] args) {
		/*
		5.참조타입
		자바는 크게 기본타입(primitive type)과 참조타입(reference type)으로 나뉜다
		기본은 int, double 등등
		참조타입은 String이 있다.(기본타입을 제외한 나머지 전부)
		
		기본타입의 변수는 실제값을 변수안에 저장.
		참조타입의 변수는 실제값이아닌 값이 저장된 주소를 저장.
		
		==나 !=로 비교하는 경우도 기본타입은 변수값을 직접비교.
		참조타입은 같은 객체를 참조하는지 조사.
		
		null은 객체가 없을경우의 초기값.
		
		new는 같아 보이는 값이라도 새로 각각의 참조를 생성해준다.
		즉 따로 new로 선언된 참조타입들은 같은 문자열이라도 다른 참조를 가진다.
		
		자세한 내용은 파워포인트.
		
		*/
		String strVar1 = "신민철";
		String strVar2 = "신민철";
		if(strVar1==strVar2)
		{
			System.out.println("strVar1과 strVar2는 참조가 같음.");
		}
		else
		{
			System.out.println("strVar1과 strVar2는 참조가 다름.");
		}
		
		if(strVar1.equals(strVar2))
		{
			System.out.println("strVar1과 strVar2는 문자열이 같음.");
		}
		
		String strVar3 = new String("신민철");
		String strVar4 = new String("신민철");
		
		if(strVar3 == strVar4)
		{
			System.out.println("strVar3와 strVar4는 참조가 같음.");
		}
		else
		{
			System.out.println("strVar3와 strVar4는 참조가 다름.");
		}
		
		if(strVar3.equals(strVar4))
		{
			System.out.println("strVar3와 strVar4는 문자열이 같음.");
		}
	}
	
}
