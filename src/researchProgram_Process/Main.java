package researchProgram_Process;

import java.util.List;
import java.util.Map;

public class Main {
	
	public static void main(String[] args)
	{
		String mainPath = "D:\\HHS\\강의자료\\자바\\알고리즘\\00_실습\\";
		Main setDB = new Main();
		Map<String,List<String>> researchDB = setDB.setResearchDB(mainPath);
		
		MainSystem mainsystem = new MainSystem();
		mainsystem.mainSystem(researchDB, mainPath);		
	}
	
	private Map<String,List<String>> setResearchDB(String path)
	{
		SystemValue sValue = new SystemValue();
		Map<String,List<String>> researchDB = sValue.setDBMap(path);
		return researchDB;
	}
}
