package mainTest_02;

import java.util.*;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;


public class FileWrite {
	
	final private String WRITE_FATH;
	private File writeList = null;
	private BufferedWriter bwWriteList = null;
	
	FileWrite(String writefath)
	{
		this.WRITE_FATH = writefath;
	}
	public void writeSystem(List<String> list)
	{
		try
		{
			writeList = new File(WRITE_FATH);
			bwWriteList = new BufferedWriter(new FileWriter(writeList));
			
			for(String value : list)
			{
				bwWriteList.write(value);
				bwWriteList.newLine();
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
			if(bwWriteList!=null)
			{
				try
				{
					bwWriteList.close();
				}
				catch(IOException e)
				{
					System.out.println("대상(파일)을 찾을 수가 없습니다.");
				}
			}
		}	
	}

}
