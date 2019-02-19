package work.algorithm_01;

public class Main {

	public static void main(String[] args) {
		
		People pp = new People();
		
		String firstName = "black";
		String word = "Hellow";
		
		String fullName = pp.getMyName(firstName);
		int height = pp.getMyHeight();
		System.out.println(fullName);
		System.out.println(height);
		pp.say(word);
		
				
	}

}
