package mainTest_02;

public class Main {
	
	public static void main(String[] args) {
		
		String read = "D:\\hhs\\javaSourceData\\pw.txt";
		String write = "D:\\hhs\\javaSourceData\\password.txt";
		FileOpen fileopen = new FileOpen(read);
		
		fileopen.openSystem();
				
		PasswordChecker pwc = new PasswordChecker();
		pwc.passwordCheckSystem(fileopen.pushList());
		
		FileWrite filewrite = new FileWrite(write);
		filewrite.writeSystem(pwc.resultList);		
		
	}

}
