package ex190131.Ex02_2;

import ex190131.Ex02.A;

public class C {

	public C()
	{
		A a = new A();
		//�ٸ� ��Ű���� ���
		a.field1 = 1;	//public
//		a.field2 = 1;	//default(����)
//		a.field3 = 1;	//private

		a.method1();	//public
//		a.method2();	//default(����)
//		a.method3();	//private
	}

}
