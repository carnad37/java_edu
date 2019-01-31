package ex190131.Ex02_2;

import ex190131.Ex02.A;

public class C {

	public C()
	{
		A a = new A();
		//다른 패키지의 경우
		a.field1 = 1;	//public
//		a.field2 = 1;	//default(세모)
//		a.field3 = 1;	//private

		a.method1();	//public
//		a.method2();	//default(세모)
//		a.method3();	//private
	}

}
