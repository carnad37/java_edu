package makeArray_SizeControl;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Main {

	
	public static void main(String[] args)
	{
//		ArrayToList list = new ArrayToList();		
//		
//		for(int i=0;i<50;i++)
//		{
//			list.add(i);
//		}
//		System.out.println("get(23) : "+list.get(23));
//		System.out.println("size : "+list.size());
//		System.out.println("get(1) : "+list.get(1));
//		list.set(1, 0);
//		System.out.println("set : index 0(1->0)");
//		System.out.println("get(1) : "+list.get(1));
//		System.out.println();
//		
//		boolean check = list.isEmpty();
//		System.out.println(check);
//		
//		list.clear();
//		
//		check = list.isEmpty();
//		System.out.println(check);
//		
//		list.add(10000);
//		
//		check = list.isEmpty();
//		System.out.println(check);		
//		
//		list.remove(0);
//		
//		check = list.isEmpty();
//		System.out.println(check);
//		
//		System.out.println();
//
//		for(int i=0;i<50;i++)
//		{
//			list.add(i);
//		}
//		
//		check = list.contains(51);
//		System.out.println(check);
//		
//		
//		check = list.contains(50);
//		System.out.println(check);
//		
//		check = list.contains(49);
//		System.out.println(check);
//		
//		System.out.println("size : "+list.size());
//		
//		ArrayToList test = new ArrayToList();
//		System.out.println(test.getArraySize());
//
//		for (int i = 0; i < 10; i++)
//		{
//			test.add(i);
//		}
//		System.out.println(test.getArraySize());
//		
//		test.add(1);
//		System.out.println(test.getArraySize());
//
//		test.remove(test.size()-1);
//		System.out.println(test.getArraySize());
//
//		test.remove(test.size()-1);
//		System.out.println(test.getArraySize());
//
//		test.remove(test.size()-1);
//		System.out.println(test.get(test.size()-1));
//		System.out.println(test.getArraySize());
//		
//		test.remove(test.size()-1);
//		System.out.println(test.size());
//		test.remove(test.size()-1);
//		System.out.println(test.size());
//		test.remove(test.size()-1);
//		System.out.println(test.size());
//		test.remove(test.size()-1);
//		System.out.println(test.size());
//		test.remove(test.size()-1);
//		System.out.println(test.size());
//		test.remove(test.size()-1);
//		System.out.println(test.size());
//		test.remove(test.size()-1);
//		System.out.println(test.contains(2));
//		System.out.println(test.size());
//		test.remove(test.size()-1);
//		System.out.println(test.size());
//		System.out.println(test.getArraySize());

//		ArrayToSet target = new ArrayToSet();
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
//		Iterator<Object> aa = target.iterator();
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
//		Iterator<Object> bb = target.iterator();
//		while(bb.hasNext())
//		{
//			System.out.println(bb.next());
//		}		
		
		ArrayToMapB map = new ArrayToMapB();
		System.out.println(map.isEmpty());

		map.put("a", "b");
		System.out.println(map.get("a"));

		map.put("b", "c");
		
		map.put("a", "e");
		System.out.println(map.get("a"));
		System.out.println(map.isEmpty());
		
		for (Map.Entry<Object, Object> entry : map.entrySet())
		{
			System.out.println("Å° : " + entry.getKey());
			System.out.println("°ª : " + entry.getValue());
		}		
		System.out.println(map.isEmpty());
		
		map.clear();
		
		for (int i = 0; i < 100; i++)
		{
			map.put(i, i);
		}
		
		System.out.println(map.size());
		System.out.println(map.get(3));
		
		Set<Object> key = map.keySet();
		Collection<Object> value = map.value();
		
		System.out.println(map.containsKey(1));
		map.remove(1);
		System.out.println(map.containsKey(1));
		
		System.out.println(map.get(1));
		
		
	}	
}
