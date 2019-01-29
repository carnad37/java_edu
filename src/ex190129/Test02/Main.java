package ex190129.Test02;

public class Main {

	public static void main(String[] args) {
		
		People pp = new People();
		
		String name = "black";
		String word = "Hellow";
		int height = 0;
		
		name = pp.getMyName(name);
		System.out.println(name+"\n");
		
		height = pp.getMyHeight();
		System.out.println(height+"\n");
		
		pp.say(word);
		
	}
	
}
