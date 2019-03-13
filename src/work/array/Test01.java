package work.array;

import java.util.*;

//숫자 범위 48~57
//영문 범위 97~122, 65~90


public class Test01 {

	public static void main(String[] args) {
		
		String word = "밥///";
		String[] wordArray = new String[2];
		wordArray = word.split("///");
		System.out.println(wordArray[1]);
		
	}

}
