package work.array;

import java.util.*;

//숫자 범위 48~57
//영문 범위 97~122, 65~90


public class Test01 {

	public static void main(String[] args) {
		
		Map<String,String> test = new HashMap<String,String>();
		
		test.put("점심", "밥");
		
		System.out.println(test.get("저녁"));
	}

}
