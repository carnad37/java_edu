package mainTest_03;


public class Main {

	public static void main(String[] args) {
		
		//기능은 총 4개.
		//도로명->우편번호,지번본번
		//지번본번->우편번호,도로명
		//우편번호->도,시,도로명,지번본번
		//0-우편번호,1-시도,2-시군구,3-도로명,4-지번본번
		
		String sourceFolder = "D:\\workspace\\source_file\\";
		String read = "cc_addr.csv";
		FileOpen fileopen = new FileOpen(sourceFolder+read);
		
		fileopen.openSystem();
		LocalAdressSearchSystem lasSystem = new LocalAdressSearchSystem(fileopen.pushList());		
		lasSystem.mainSystem();
		
	}	
}
