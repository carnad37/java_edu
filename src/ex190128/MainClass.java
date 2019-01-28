package ex190128;

class Circle{
	
	int radius;
	String name;
	
}

public class MainClass {

	public static void main(String[] args)
	{
		
		Circle pizza;
		pizza = new Circle();
		pizza.radius = 10;
		pizza.name = "자바피자";
		
		Circle donut = new Circle();
		donut.radius = 2;
		donut.name = "자바도넛";
		
		System.out.println(pizza.name);
		System.out.println(donut.name);
		
	}
}
