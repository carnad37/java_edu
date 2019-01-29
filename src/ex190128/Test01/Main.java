package ex190128.Test01;

public class Main {

	public static void main(String[] args) {
		
		Tree obj1 = new Tree();
		Tree obj2 = new Tree();
		
		obj1.height = 10;
		obj1.color = "red";
		obj1.name = "oaktree";
		
		obj2.height = 100;
		obj2.color = "green";
		obj2.name = "lemontree";
		
		System.out.println(obj1.color);
		System.out.println(obj2.color);
		System.out.println("");
		obj1.color = obj2.color;
		System.out.println(obj1.color);
		
	}
	
}
