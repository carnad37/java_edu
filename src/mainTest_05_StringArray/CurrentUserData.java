package mainTest_05_StringArray;

import java.util.List;

public class CurrentUserData
{	
	String userid;
	String username;
	String password;
	String securitynum;
	String email;
	String zipcode;
	String adress1;
	String adress2;
	String phone;
	String regedit;

	public void setStringArrayToUserData(int userNumber, List<String[]> userData)
	{
		userid = userData.get(userNumber)[0];
		username = userData.get(userNumber)[1];
		password = userData.get(userNumber)[2];
		securitynum = userData.get(userNumber)[3];
		email = userData.get(userNumber)[4];
		zipcode = userData.get(userNumber)[5];
		adress1 = userData.get(userNumber)[6];
		adress2 = userData.get(userNumber)[7];
		phone = userData.get(userNumber)[8];
		regedit = userData.get(userNumber)[9];
	}
	
	public String[] setUserDataToStringArray()
	{
		String[] userData = {userid,username,password,securitynum,email,zipcode,adress1,adress2,phone,regedit};
		return userData;
	}
	
	public String joinStringArray(String[] target, String joinWord)
	{
		String returnWord = "";
		int length = target.length-1;
		for(int i=0;i<length;i++)
		{
			returnWord = returnWord+target[i]+joinWord;
		}
		returnWord = returnWord+target[length];
		return returnWord;		
	}
}
