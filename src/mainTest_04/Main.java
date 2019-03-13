package mainTest_04;

import java.util.List;

public class Main
{
	
	public static void main(String[] args) {
		
		String path = "D:\\HHS\\강의자료\\자바\\알고리즘\\00_실습\\eng_dic.txt";
		
		FileOpen fileopen = new FileOpen();
		List<String> openList = fileopen.openSystem(path);
		
		Dictionary dictionary = new Dictionary();
		dictionary.DicMainSystem(openList);
	}
}
