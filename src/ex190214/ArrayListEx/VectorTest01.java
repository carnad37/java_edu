package ex190214.ArrayListEx;

import java.util.*;

public class VectorTest01 {
	
	public static void main(String[] args) {
		
		Vector<String> vc = new Vector<String>();
		
		for(int i=0;i<5;i++)
		{
			String element = String.valueOf((i+1));
			vc.add(element);
		}
		
		printVector(vc);
				
		vc.remove(4);		
		vc.remove(2);
		
		vc.add("10");
		vc.add("20");
		vc.add("30");
		
		printVector(vc);
		
		
		
	}
	public static void printVector(Vector<String> vc)
	{
		Iterator<String> it = vc.iterator();
		System.out.print("Vector: ");
		while(it.hasNext())
		{
			String element = it.next();
			System.out.print(element+"\t");
		}
		System.out.println();
	}

}
