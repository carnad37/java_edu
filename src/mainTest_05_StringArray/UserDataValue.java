package mainTest_05_StringArray;

import java.util.ArrayList;
import java.util.List;

public class UserDataValue
{

	List<String> userList= null;
	List<String[]> userData= null;
	String userDataPath= null;
	int userNumber;
	
	private List<String[]> setStringArrayList(List<String> list)
	{
		List<String[]> userData = new ArrayList<String[]>();
		for(int i=0;i<list.size();i++)
		{
			String[] listArray = list.get(i).split(",");
			userData.add(listArray);
		}
		return userData;
	}
	
	public void setUserData()
	{
		List<String[]> result = setStringArrayList(this.userList);
		userData = result;
	}
	

}
