package work.array;

import java.util.*;

//���� ���� 48~57
//���� ���� 97~122, 65~90


public class Test01 {

	public static void main(String[] args) {
		
		String word = "��///";
		String[] wordArray = new String[2];
		wordArray = word.split("///");
		System.out.println(wordArray[1]);
		
	}

}
