package mainTest_02;

import java.util.List;
//import java.util.ArrayList;

public class Main {
	
	public static void main(String[] args) {
		
		String read = "D:\\hhs\\javaSourceData\\pw.txt";
		String write = "D:\\hhs\\javaSourceData\\password.txt";
		FileOpen fileopen = new FileOpen();
		
		List<String> listData = fileopen.openSystem(read);
				
		PasswordChecker pwc = new PasswordChecker();
		pwc.passwordCheckSystem(listData);
		
		FileWrite filewrite = new FileWrite();
		filewrite.writeSystem(listData, write);		
		
	}
}
