package makeArray_Basic;

import java.util.Iterator;

public class Main {

	
	public static void main(String[] args) {
		
		ArrayToList list = new ArrayToList();		
		
		for(int i=0;i<50;i++)
		{
			list.add(i);
		}
		System.out.println("get(23) : "+list.get(23));
		System.out.println("size : "+list.size());
		System.out.println("get(1) : "+list.get(1));
		list.set(1, 0);
		System.out.println("set : index 0(1->0)");
		System.out.println("get(1) : "+list.get(1));
		System.out.println();
		
		boolean check = list.isEmpty();
		System.out.println(check);
		
		list.clear();
		
		check = list.isEmpty();
		System.out.println(check);
		
		list.add(10000);
		
		check = list.isEmpty();
		System.out.println(check);		
		
		list.remove(0);
		
		check = list.isEmpty();
		System.out.println(check);
		
		System.out.println();

		for(int i=0;i<50;i++)
		{
			list.add(i);
		}
		
		check = list.contains(51);
		System.out.println(check);
		
		check = list.contains(50);
		System.out.println(check);
		
		check = list.contains(49);
		System.out.println(check);
		
		System.out.println("size : "+list.size());

//		ArrayToSet<Integer> target = new ArrayToSet<Integer>();
//		target.add(3);
//		System.out.println("size : "+target.size());
//
//		target.add(4);
//		System.out.println("size : "+target.size());
//
//		target.add(4);
//		System.out.println("size : "+target.size());
//
//		target.add(4);
//		System.out.println("size : "+target.size());
//		
//		Iterator<Integer> aa = target.iterator();
//		while(aa.hasNext())
//		{
//			System.out.println(aa.next());
//		}
//		
//		
//		target.remove(3);
//		System.out.println("size : "+target.size());	
//		
//		
//		Iterator<Integer> bb = target.iterator();
//		while(bb.hasNext())
//		{
//			System.out.println(bb.next());
//		}		
	}	
}
