package ex190214.ArrayListEx;

import java.util.*;

public class ArrayListExample {
	
	public static void main(String[] args) {

		List<String> list  = new ArrayList<String>();
		//ArrayList�� �ڷ��� �߰�, ���Ű� �����ϴ�.
		
		list.add("java");
		list.add("JDBC");
		list.add("servlet/JSP");
		list.add(2,"Database");
		list.add("iBATIS");
		
		int size = list.size();
		System.out.println("�� ��ü��: "+size);
		System.out.println();
		
		String skill = list.get(2);
		System.out.println("2: "+skill);
		System.out.println();
		
		int i = 0;
		
		for(i=0;i<list.size();i++)
		{
			String str = list.get(i);
			System.out.println(i+":"+str);
		}
		System.out.println();
		
		list.remove(2);
		list.remove(2);
		list.remove("iBATIS");
		
		for(i=0; i<list.size(); i++)
		{
			String str = list.get(i);
			System.out.println(i+":"+str);
		}
	}
}
