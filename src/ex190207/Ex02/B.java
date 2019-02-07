package ex190207.Ex02;

class B extends A{
	
	public B()
	{
		System.out.println("생성자B");		
	}
	public B(int x)
	{
		super(x);
		//A의 생성자를 호출. 자식클래스가 상속받을시 생성자는 제외?
		System.out.println("매개변수 생성자 B"+x);
	}

}
