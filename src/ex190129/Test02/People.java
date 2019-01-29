package ex190129.Test02;

public class People {
	
	String  myName = "john";
	int myheight = 179;
	
	public String getMyName(String firstName)
	{
		System.out.println("입력값 확인 : firstName="+firstName);
		String ret = firstName + myName;
		return ret;
	}
	
	public int getMyHeight()
	{
		System.out.println("getMyHeight 확인");
		return myheight;
	}
	
	public void say(String word)
	{
		System.out.println("입력값 확인 : word="+word);
		System.out.println(word);
	}
	
}
