package ex190130.Ex03;

public class CalculatorExample {
	
	public static void main(String[] args) {
		
		Calculator cal = new Calculator();
		
		double result1 = cal.areaRectangle(10);
		
		double result2 = cal.areaRectangle(10, 20);
		
		System.out.println("정사각형의 넓이 = "+result1);
		System.out.println("직사각형의 넓이 = "+result2);
		
	}

}
