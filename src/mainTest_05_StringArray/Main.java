package mainTest_05_StringArray;

import java.util.List;



public class Main {
	public static void main(String[] args)
	{	
		final String userDataPath = "D:\\HHS\\�����ڷ�\\�ڹ�\\�˰���\\00_�ǽ�\\user_data.csv";
		
		FileOpen fileopen = new FileOpen();		
		List<String> listData = fileopen.openSystem(userDataPath);
		
		MainSystem mainSystem = new MainSystem();
		mainSystem.mainSystem(listData, userDataPath);
		
	}	
}