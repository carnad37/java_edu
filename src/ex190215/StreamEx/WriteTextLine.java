package ex190215.StreamEx;

import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;

public class WriteTextLine {
	
	public static void main(String[] args) {
		File file = null;
//		FileWriter fw = null;
		BufferedWriter bufW = null;
		try
		{
			file = new File("d:\\hhs2\\file\\new_java.txt");
//			fw = new FileWriter(file);
//			bufW = new BufferedWriter(fw);
			bufW = new BufferedWriter(new FileWriter(file));
			
			if(file.isFile()&&file.canWrite())
			{
				//쓰기
				bufW.write("문자열 추가1");
				bufW.newLine();
				bufW.write("문자열 추가2");
								
			}
			
		}
		catch(IOException e)
		{
			
		}
		finally
		{
			try
			{
//				fw.close();
				bufW.close();
			}
			catch(IOException e)
			{
				System.out.println(e);
			}
		}		
	}
		
}


