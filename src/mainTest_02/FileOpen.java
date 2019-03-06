package mainTest_02;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class FileOpen
{

	final private String READ_FATH;
	private File phoneList = null;
	private BufferedReader brPhoneList = null;
	private List<String> openDataList = new ArrayList<String>();
	FileOpen(String readfath)
	{
		this.READ_FATH = readfath;
	}
	public void openSystem()
	{
		try
		{
			phoneList = new File(READ_FATH);
			brPhoneList = new BufferedReader(new FileReader(phoneList));
			String line = "";
			while((line=brPhoneList.readLine())!=null)	//모든줄이 입력되면 null이 반환된다.
			{
				openDataList.add(line);
			}
			
		}
		catch(FileNotFoundException e)
		{
			System.out.println("대상(파일)을 찾을 수가 없습니다.");
		}
		catch(IOException e)
		{
			System.out.println("대상(파일)을 찾을 수가 없습니다.");
		}
		finally
		{
			try
			{
				brPhoneList.close();
			}
			catch(IOException e)
			{
				System.out.println("대상(파일)을 찾을 수가 없습니다.");
			}
		}	
	}
	public List<String> pushList()
	{
		return this.openDataList;
	}
	
	
	
}
