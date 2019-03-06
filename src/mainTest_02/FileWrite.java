package mainTest_02;

import java.util.*;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;


public class FileWrite {
	
	final private String WRITE_FATH;
	private File contact = null;
	private BufferedWriter bwPhoneList = null;
	
	FileWrite(String writefath)
	{
		this.WRITE_FATH = writefath;
	}
	public void writeSystem(List<String> list)
	{
		try
		{
			contact = new File(WRITE_FATH);
			bwPhoneList = new BufferedWriter(new FileWriter(contact));
			
			for(String value : list)
			{
				bwPhoneList.write(value);
				bwPhoneList.newLine();
			}
			
			
		}
		catch(FileNotFoundException e)
		{
			System.out.println("���(����)�� ã�� ���� �����ϴ�.");
		}
		catch(IOException e)
		{
			System.out.println("���(����)�� ã�� ���� �����ϴ�.");
		}
		finally
		{
			try
			{
				bwPhoneList.close();
			}
			catch(IOException e)
			{
				System.out.println("���(����)�� ã�� ���� �����ϴ�.");
			}
		}	
	}

}
