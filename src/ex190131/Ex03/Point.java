package ex190131.Ex03;

public class Point {
	
	private int x,y;
	
	//�ڵ� ������
	
	void set(int x, int y)	//�Է¸� ����.
	{
		this.x = x;
		this.y = y;
		System.out.println("set �ҷ���");
	}

	void showPoint()	//default
	{
		System.out.println("showPoint �ҷ���");
		System.out.println("("+x+","+y+")");
	}
}
