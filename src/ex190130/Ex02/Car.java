package ex190130.Ex02;

public class Car {
	//필드
	String model;
	int speed;
	
	//생성자
	Car()
	{
		
	}
	Car(String model)
	{
		//this를 붙여주지 않으면 클래스 내의 필드값을 읽어오지 못함.
		this.model = model;
	}
	
	//메소드
	void setSpeed(int speed)
	{
		this.speed = speed;
	}
	void run()
	{
		for(int i=10;i<=50;i+=10)
		{
			//setSpeed는 this를 생략해줘도 결과엔 변함이 없다.
			this.setSpeed(i);
			System.out.println(this.model+"가 달립니다.(시속:"+this.speed+"km/h)");
		}
	}

}
