package work.algorithm_01;

public class People {

	String myName = "john";
	int myHeight = 179;
	
	public String getMyName(String firstName)
	{
		String ret = firstName+myName;		
		return ret;
	}
	public int getMyHeight()
	{
		return myHeight;
	}
	public void say(String word)
	{
		System.out.println(word);
	}
	
}

