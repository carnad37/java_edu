package mainTest_05;

import java.util.List;
import java.util.Scanner;

import mainTest_03.LocalAdressValue_Map;
import mainTest_04.SystemValue;


public class Main {
	

	public static void main(String[] args)
	{
	
		FileOpen fileopen = new FileOpen();		
		List<String> listData = fileopen.openSystem(SystemValue.USER_DATA);
		
		MainSystem mainSystem = new MainSystem();
		mainSystem.mainMenu(listData, SystemValue.USER_DATA);
		
		

		
		
		
	}
	
	
}
