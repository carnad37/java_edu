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
			//���� ��ü ����
			file = new File("D:\\hhs2\\file\\phones_java.txt");
			//�Է� ��Ʈ�� ����
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
				//������ Exception�� �߻��ص� close�ǰ� ���ش�.
				filereader.close();
			}
			catch(IOException e)
			{
				System.out.println(e);
			}
		}		
	}	
}
