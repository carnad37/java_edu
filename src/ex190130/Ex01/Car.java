package ex190130.Ex01;

public class Car {
	
	//필드선언
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;
	
	//생성자, 디폴트 생성자는 어떠한 생성자도 없을경우만 자동생성.
	Car()
	{
		
	}
	Car(String model)
	{
//		this.model = model;
		//this(값, 값, 값)을 통해
		//값이 3번 쓰인 생성자와 연결가능.
		//목표가 되는 생성자가 먼저 불러와지고(호출),
		//각각의 값이 대입되기까지가 진행된다.
		//다시 진행되는식.
		this(model, null);
		//Car(model, null, 0)같은 느낌?
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
