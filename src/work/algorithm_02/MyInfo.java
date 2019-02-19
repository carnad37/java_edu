package work.algorithm_02;

public class MyInfo {
	
		int birthYear = 2005;
		String addr = "1010";
		String name = "mary";
		String gender = "woman";
		
		public String getMyName(String familyName)
		{
			String ret = name+" "+familyName;
			return ret;
		}
		public int getMyAge(int currentYear)
		{
			int ret = currentYear-this.birthYear;
			return ret;
		}
		public String getMyAdress()
		{
			return this.addr;
		}
}
