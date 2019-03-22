package work.array;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Test03
{

	public static void main(String[] args) {
		
//		String path = "D:\\HHS\\강의자료\\자바\\알고리즘\\00_실습\\text01.txt";
//		File file = new File(path);
//		BufferedReader reader;
//		
//		try 
//		{
//			reader = new BufferedReader(new FileReader(file));
//			for(int i=0;i<3;i++)
//			{
//				String line = "";
//				while((line=reader.readLine())!=null)
//				{
//					
//					System.out.println(line);
//
//				}
//			}
//			reader.close();
//		}
//		catch(IOException e)
//		{
//			
//		}
//		
		String path = "D:\\HHS\\강의자료\\자바\\알고리즘\\00_실습\\text01.txt";
		File file = new File(path);
		BufferedWriter reader;
		
		try 
		{
			reader = new BufferedWriter(new FileWriter(file));

//				String line = "";
//				while((line=reader.readLine())!=null)
//				{
//					
//					System.out.println(line);
//
			
//				}
			List<String> list = new ArrayList<String>();
			
			list.add(path);
			list.add("");
			list.add("ㅇㅇㅇㅇ");
			
			for(String value : list)
			{
				reader.write(value);
				reader.newLine();
			}
			
			reader.close();
		}
		catch(IOException e)
		{
			
		}
		
	
	}
	
	
}
