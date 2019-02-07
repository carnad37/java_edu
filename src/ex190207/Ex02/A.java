package ex190207.Ex02;

class A {
	
	int num = 0;
	
	public A()
	{
		System.out.println("생성자A");
	}
	public A(int x)
	{
		this.num = 1;
		System.out.println("매개변수 생성자 A"+x);
	}

}
