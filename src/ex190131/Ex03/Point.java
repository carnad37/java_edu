package ex190131.Ex03;

public class Point {
	
	private int x,y;
	
	//자동 생성자
	
	void set(int x, int y)	//입력만 받음.
	{
		this.x = x;
		this.y = y;
		System.out.println("set 불러옴");
	}

	void showPoint()	//default
	{
		System.out.println("showPoint 불러옴");
		System.out.println("("+x+","+y+")");
	}
}
