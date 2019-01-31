package ex190131.Ex03;

public class ColorPoint extends Point{

	private String color;
	
	void setColor(String color)	//default
	{
		this.color = color;
	}
	void showColorPoint()
	{
		System.out.println(color);
		showPoint();	//상속받은 메소드
	}
	
}
