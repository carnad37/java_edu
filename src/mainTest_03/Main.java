package mainTest_03;

import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		//기능은 총 4개.
		//도로명->우편번호,지번본번
		//지번본번->우편번호,도로명
		//우편번호->도,시,도로명,지번본번
		//0-우편번호,1-시도,2-시군구,3-도로명,4-지번본번
		
		String sourceFolder = "D:\\HHS\\강의자료\\자바\\알고리즘\\실습\\";
		String read = "cc_addr.csv";
		String fullpath = sourceFolder+read;
		
		FileOpen fileopen = new FileOpen();
		List<String> listData = fileopen.openSystem(fullpath);
				
		LocalAdressSearchSystem_Object lasSystem = new LocalAdressSearchSystem_Object();
		lasSystem.mainSystem(listData);
		
	}	
}
