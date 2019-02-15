package ex190215.StreamEx;

import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

public class ReadTextLine {

	public static void main(String[] args) {
		
		File file = null;
		FileReader filereader=null;
		BufferedReader bufReader = null;
		List<String> name = null;
		List<String> phoneNum = null;
		try
		{
			//���� ��ü ����
			file = new File("D:\\hhs2\\file\\phones_java.txt");
			//�Է� ��Ʈ�� ����
			filereader = new FileReader(file);
			//�Է� ���� ����
			bufReader = new BufferedReader(filereader);
			//readLine()�� �� �о�µ� null�� ��ȯ�Ѵ�.
			
			//name�� phoneNum ��ü ����.
			name = new ArrayList();
			phoneNum = new ArrayList();
			
			String line;
			
//			String inputToList;			
//			while((line=bufReader.readLine())!=null)
//			{
//				inputToList = line.substring(0, 3);
//				name.add(inputToList);
//				inputToList = line.substring(4);
//				phoneNum.add(inputToList);
//			}
			
			while((line=bufReader.readLine())!=null)
			{
				String[] data = line.split(" ");
				name.add(data[0]);
				phoneNum.add(data[1]);
			}
			
			printList(name, "name");
			printList(phoneNum, "phoneNum");		
			

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
				filereader.close();
			}
			catch(IOException e)
			{
				System.out.println(e);
			}
		}		
		
	}
	
	public static void printList(List<String> list,String listName)
	{
		Iterator<String> it = list.iterator();
		System.out.println(listName+"�� ��Ҵ� ������ ����.");
		int count = 1;
		while(it.hasNext())
		{
			String element = it.next();
			System.out.println(count+" : "+element);
			count++;
		}
	}
	
//	public static List<String> adressToList(List<String> name, List<String> phoneNum, BufferedReader buf)
//	{
//		
//		return
//	}
//	
}
