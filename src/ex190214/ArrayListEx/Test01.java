package ex190214.ArrayListEx;

import java.util.*;

public class Test01 {

	//
	public static void main(String[] args) {
		
		List<String> list = new ArrayList();
		
		list.add("Ǫ");
		list.add("��");
		list.add("��");
		list.add("��");
		list.add("��");
		printList(list);
		
		list.remove("��");
		
		printList(list);
		
		list.add("��");
		
		printList(list);

	}
	
	public static void printList(List list)
	{
		//add,remove
//		if(select.equals("add"))
//		{
//			list.add("")
//		}
		System.out.println(list);
	}
	
}
