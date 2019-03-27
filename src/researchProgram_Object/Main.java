package researchProgram_Object;

import java.util.Map;

public class Main {
	
	public static void main(String[] args)
	{
		String mainPath = "D:\\HHS\\�����ڷ�\\�ڹ�\\�˰���\\00_�ǽ�\\";
		Main setDB = new Main();
		Map<String, Research> researchDB = setDB.setResearchDB(mainPath);
		
		MainSystem mainsystem = new MainSystem();
		mainsystem.mainSystem(researchDB, mainPath);
	}
	
	private Map<String,Research> setResearchDB(String path)
	{
		FileDataManager setValue = new FileDataManager();
		Map<String,Research> researchDB = setValue.setDBMap(path);
		setValue.setData(researchDB, path);
		return researchDB;
	}
}
