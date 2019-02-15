package ex190215.StreamEx;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadTextChar {

	public static void main(String[] args)
	{
		File file = null;
		FileReader filereader=null;
		try
		{
			//파일 객체 생성
			file = new File("D:\\hhs2\\file\\phones_java.txt");
			//입력 스트림 생성
			filereader = new FileReader(file);
			int singleCh = 0;
			while((singleCh = filereader.read())!=-1)
			{
				System.out.print((char)singleCh);
			}
		}
		catch(FileNotFoundException e)
		{
			
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
		finally
		{
			try
			{
				//위에서 Exception이 발생해도 close되게 해준다.
				filereader.close();
			}
			catch(IOException e)
			{
				System.out.println(e);
			}
		}		
	}	
}
