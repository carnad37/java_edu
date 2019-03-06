package mainTest_01;

public class Main {

	public static void main(String[] args)	
	{
		String read = "D:\\hhs\\javaSourceData\\phone_list.txt";
		String write = "D:\\hhs\\javaSourceData\\Contact.txt";
		
		FileOpen fileopen = new FileOpen(read);
		fileopen.openSystem();
		
		PhoneNumberChecker pnc = new PhoneNumberChecker();
		pnc.mainSystem(fileopen.pushList());
		
		FileWrite filewrite = new FileWrite(write);
		filewrite.writeSystem(pnc.contactList);		
		
	}	
}
