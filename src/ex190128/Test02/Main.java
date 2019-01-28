package ex190128.Test02;

public class Main {

	public static void main(String[] args) {
		
		Light lg = new Light();
		int turnOn = 1;
		int turnOff = 10;
		String color = "yellow";
				
		int result01 = lg.turnOn(turnOn);
		int result02 = lg.turnOff(turnOff);
		String result03 = lg.getColor(color);
		
		System.out.println(result01);
		System.out.println(result02);
		System.out.println(result03);


	}
	
}
