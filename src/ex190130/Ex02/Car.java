package ex190130.Ex02;

public class Car {
	//�ʵ�
	String model;
	int speed;
	
	//������
	Car()
	{
		
	}
	Car(String model)
	{
		//this�� �ٿ����� ������ Ŭ���� ���� �ʵ尪�� �о���� ����.
		this.model = model;
	}
	
	//�޼ҵ�
	void setSpeed(int speed)
	{
		this.speed = speed;
	}
	void run()
	{
		for(int i=10;i<=50;i+=10)
		{
			//setSpeed�� this�� �������൵ ����� ������ ����.
			this.setSpeed(i);
			System.out.println(this.model+"�� �޸��ϴ�.(�ü�:"+this.speed+"km/h)");
		}
	}

}
