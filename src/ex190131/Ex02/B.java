package ex190131.Ex02;

public class B {

	public B()
	{
		A a = new A();
		//같은 패키지의 경우
		a.field1 = 1;	//public
		a.field2 = 1;	//default(세모)
//		a.field3 = 1;	//private

		a.method1();	//public
		a.method2();	//default(세모)
//		a.method3();	//private
	}
	
}
