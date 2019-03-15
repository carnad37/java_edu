package mainTest_05_HashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserDataValue
{
	final String[] formatName = {"���̵�","��й�ȣ","�̸�","�ֹι�ȣ","�̸���","�����ȣ","�ּ�","���ּ�","��ȭ��ȣ","��������"};
	List<String> userList = null;
	List<Map<String,String>> userData= null;
	Map<String,String> currentUser= null;
	String userDataPath= null;
	int userNumber = 0;
	
	private List<Map<String,String>> setMapList(List<String> list)
	{
		List<Map<String,String>> mapList = new ArrayList<Map<String,String>>();
		int length = formatName.length;
		for(String value:list)
		{
			Map<String,String> mapData = new HashMap<String, String>();
			String[] valueArray = value.split(",");
			for(int i=0;i<length;i++)
			{
				mapData.put(formatName[i], valueArray[i]);
			}
			mapList.add(mapData);
		}
		return mapList;
	}
	
	public void setUserData()
	{
		List<Map<String,String>> result = setMapList(this.userList);
		userData = result;
	}
	
	public void setCurrentUser()
	{
		currentUser = userData.get(userNumber);
	}
	
	public String setCurrentUserToString()
	{
		int i=0;
		String userDataLine = "";
		for(i=0;i<formatName.length-1;i++)
		{
			userDataLine += currentUser.get(formatName[i])+",";
		}
		userDataLine += currentUser.get(formatName[i]);
		return userDataLine;
	}
	
	public String setCurrentUserToString(Map<String,String> userData)
	{
		int i=0;
		String userDataLine = "";
		for(i=0;i<formatName.length-1;i++)
		{
			userDataLine += userData.get(formatName[i])+",";
		}
		userDataLine += userData.get(formatName[i]);
		return userDataLine;
	}

}
