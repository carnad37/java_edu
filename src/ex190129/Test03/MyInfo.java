package ex190129.Test03;

public class MyInfo {
	
	int birthYear = 2005;
	String addr = "1010", name = "mary", gender = "woman";
	
	public String getMyName(String familyName)
	{
		String res = name+familyName;
		return res;
	}
	
	public int getMyAge(int crrentYear)
	{
		int res = crrentYear-birthYear;
		return res;
	}

	public String getMyAddress()
	{
		return addr;
	}
}
