package mainTest_05_2;

import java.util.List;



public class Main {
	

	public static void main(String[] args)
	{
	
		String userDataPath = "D:\\HHS\\�����ڷ�\\�ڹ�\\�˰���\\00_�ǽ�\\user_data.csv";
		
		FileOpen fileopen = new FileOpen();		
		List<String> listData = fileopen.openSystem(userDataPath);
		
		MainSystem mainSystem = new MainSystem();
		mainSystem.mainMenu(listData, userDataPath);		
		
	}
	
}
