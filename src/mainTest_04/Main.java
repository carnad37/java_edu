package mainTest_04;

import java.util.List;

public class Main
{
	
	public static void main(String[] args) {
		
		String path = "D:\\HHS\\�����ڷ�\\�ڹ�\\�˰���\\00_�ǽ�\\eng_dic.txt";
		
		FileOpen fileopen = new FileOpen();
		List<String> openList = fileopen.openSystem(path);
		
		Dictionary dictionary = new Dictionary();
		dictionary.DicMainSystem(openList);
	}
}
