package ex190114;

import java.util.Scanner;

public class Light {

	public static void main(String[] args) {
	
		String color = "yellow";
		int time = 0;
		int timeOn= 11;
		int timeOff= 3;
		String lastColor = getColor(color);
		timeOn=turnOn(time);
		timeOff=turnOff(time);
		
	}
	
	public static String getColor(String color){
		
		color = "red";
		return color;
		
	}
	
	public static int turnOn(int time) {
		
		time = 12;
		return time;
		
	}
	
	
	public static int turnOff(int time) {
		
		time = 4;
		return time;
	}
	public static String printTyping(String type) {
		
		String res = null;
		Scanner sc = new Scanner(System.in);
		System.out.println(type+"을 입력해주세요.");
		res = sc.next();		
		return res;
		
	}
}
