package ex190214.ArrayListEx;

import java.util.*;

public class Test01 {

	//
	public static void main(String[] args) {
		
		List<String> list = new ArrayList();
		
		list.add("푸");
		list.add("르");
		list.add("른");
		list.add("바");
		list.add("다");
		printList(list);
		
		list.remove("르");
		
		printList(list);
		
		list.add("야");
		
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
