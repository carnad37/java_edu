package mainTest_01;

import java.util.*;

public class Main {

	public static void main(String[] args)	
	{
		String read = "D:\\hhs\\javaSourceData\\phone_list.txt";
		String write = "D:\\hhs\\javaSourceData\\Contact.txt";
		
		FileOpen fileopen = new FileOpen();
		List<String> listData = fileopen.openSystem(read);
		
		PhoneNumberChecker pnc = new PhoneNumberChecker();	
		List<String> resultData = pnc.mainSystem(listData);
		
		FileWrite filewrite = new FileWrite();
		filewrite.writeSystem(resultData, write);
		
	}	
}
