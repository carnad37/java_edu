package ex190207.Ex04_2;

class SubObject extends SuperObject{

	public void draw()
	{
		System.out.println("Sub Object");
	}
	public static void main(String[] args)
	{
		SuperObject b = new SubObject();
		b.paint();
	}
	
}
