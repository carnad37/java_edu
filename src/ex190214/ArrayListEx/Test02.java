package ex190214.ArrayListEx;

import java.util.*;

public class Test02 {

	public static void main(String[] args) {
		
		List<Double> list = new LinkedList<Double>();
		
		addList(list, 10);
		printList(list);
		System.out.println();
//remove로 int를 입력하는데 list의 값이 int면 문제가 생길수 있다.
		list.remove(7);
		list.remove(5);
		list.remove(3);
		list.remove(1);
		
		printList(list);
		
		addList(list, 2);

		printList(list);
		
	}
	public static void addList(List list,int repeat)
	{
		double num,i;
		for(i=0;i<repeat;i++)
		{
			num = (Math.random()*10);
			list.add(num);
		}
		
	}
	public static void printList(List list)
	{
		int i;
		for(i=0;i<list.size();i++)
		{
			double str = (double)list.get(i);
			System.out.println("index"+i+" : "+str);
		}
		System.out.println();
	}
	
}
