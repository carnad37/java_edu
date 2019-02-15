package ex190215.StreamEx;

import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.BufferedReader;

public class SaveNameAndPhoneNum {
	
	public static void main(String[] args) {
		
		File fileR = null;
		File filePhone = null;
		File fileName = null;
		BufferedWriter buWname = null;
		BufferedWriter buWphone= null;
		BufferedReader buR = null;
		
		try
		{
			fileR = new File("D:\\hhs2\\file\\phones_java.txt");
			fileName = new File("d:\\hhs2\\file\\name_java.txt");
			filePhone = new File("d:\\hhs2\\file\\phoneNum_java.txt");
			buWname = new BufferedWriter(new FileWriter(fileName));
			buWphone = new BufferedWriter(new FileWriter(filePhone));
			buR = new BufferedReader(new FileReader(fileR));
			
			String line = "";
			while((line = buR.readLine())!=null)
			{
				String[] data = line.split(" ");
				buWname.write(data[0]);
				buWname.newLine();
				buWphone.write(data[1]);
				buWphone.newLine();
			}
			
		}
		catch(FileNotFoundException e)
		{
			
		}
		catch(IOException e)
		{
			
		}
		finally
		{
			try
			{
				buWname.close();
				buWphone.close();
				buR.close();
			}
			catch(IOException e)
			{
				System.out.println(e);
			}
		}
		
	}
	
//
//	 public static void writeNewText(BufferedReader bur,BufferedWriter buw)
//	 {
//	 	String line = "";
//		while((line = buR.readLine())!=null)
//		{
//			String[] data = line.split(" ");
//			buWname.write(data[0]);
//			buWname.newLine();
//			buWphone.write(data[1]);
//			buWphone.newLine();
//		}
//	  
//	  
//	 } 

	
	

}
