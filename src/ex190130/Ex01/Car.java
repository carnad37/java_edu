package ex190130.Ex01;

public class Car {
	
	//�ʵ弱��
	String company = "�����ڵ���";
	String model;
	String color;
	int maxSpeed;
	
	//������, ����Ʈ �����ڴ� ��� �����ڵ� ������츸 �ڵ�����.
	Car()
	{
		
	}
	Car(String model)
	{
//		this.model = model;
		//this(��, ��, ��)�� ����
		//���� 3�� ���� �����ڿ� ���ᰡ��.
		//��ǥ�� �Ǵ� �����ڰ� ���� �ҷ�������(ȣ��),
		//������ ���� ���ԵǱ������ ����ȴ�.
		//�ٽ� ����Ǵ½�.
		this(model, null);
		//Car(model, null, 0)���� ����?
		System.out.println("car_01");
	}
	Car(String model, String color)
	{
//		this.model = model;
//		this.color = color;
		this(model , color, 0);
		System.out.println("car_02");

	}
	Car(String model, String color, int maxSpeed)
	{
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
		System.out.println("car_03");

	}

}
