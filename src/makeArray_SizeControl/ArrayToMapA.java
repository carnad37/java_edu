package makeArray_SizeControl;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class ArrayToMapA
{
	private final static int EMPTY = 0;

	//key의 인덱스로 value찾기.
	private ArrayToSet keySet;
	private ArrayToList valueList;
	private int length;
	
	public ArrayToMapA()
	{	
		//인덱스로 찾기
		clear();
	}
	
	public Object put(Object pKey, Object pValue)
	{
		if (length == EMPTY)
		{
			keySet.add(pKey);
			valueList.add(pValue);
			length++;
			return pValue;
		}
		
		Iterator<Object> keyIter = keySet.iterator();
		int count = 0;
		while(keyIter.hasNext())
		{
			Object key = keyIter.next();
			if (key.equals(pKey))
			{
				Object value = valueList.get(count);
				valueList.set(count, pValue);
				return value;
			}
			count++;
		}
		keySet.add(pKey);
		valueList.add(pValue);
		length++;
		return pValue;
	}
	
	public boolean containsKey(Object key)
	{
		return keySet.contains(key);
	}
	
	public boolean containsValue(Object value)
	{
		return valueList.contains(value);
	}
	
//	public ArrayToSet entrySet()
//	{
//		ArrayToSet objSet = new ArrayToSet();
//		Iterator<Object> keyIter = keySet.iterator();
//		int count = 0;
//		while(keyIter.hasNext())
//		{
//			Object key = keyIter.next();
//			Map.Entry<Object, Object> mapEntry= new MapEntryImpl<Object, Object>(key);
//			Object value = valueList.get(count);
//			mapEntry.setValue(value);
//			objSet.add(mapEntry);
//			count++;
//		}
//		return objSet;
//	}
	
	public Set<Map.Entry<Object, Object>> entrySet()
	{
		Set<Map.Entry<Object, Object>> objSet = new HashSet<Map.Entry<Object, Object>>();
		Iterator<Object> keyIter = keySet.iterator();
		int count = 0;
		while(keyIter.hasNext())
		{
			Object key = keyIter.next();
			Map.Entry<Object, Object> mapEntry = new MapEntryImpl<Object, Object>(key);
			Object value = valueList.get(count);
			mapEntry.setValue(value);
			objSet.add(mapEntry);
			count++;
		}
		return objSet;
	}
	
	public Object get(Object pKey)
	{
		Iterator<Object> keyIter = keySet.iterator();
		int count = 0;
		while(keyIter.hasNext())
		{
			Object key = keyIter.next();
			if(key.equals(pKey))
			{
				Object value = valueList.get(count);
				return value;
			}
			count++;
		}
		return null;
	}
	
	public boolean isEmpty()
	{
		return keySet.isEmpty();
	}
	
	public ArrayToSet keySet()
	{
		return keySet;
	}
	
	public int size()
	{
		return length;
	}
	
	public ArrayToList value()
	{
		return valueList;
	}
	
	public void clear()
	{
		this.length = EMPTY;
		keySet = new ArrayToSet();
		valueList = new ArrayToList();
	}
	
	public Object remove(Object pKey)
	{
		Iterator<Object> keyIter = keySet.iterator();
		int count = 0;
		while(keyIter.hasNext())
		{
			Object key = keyIter.next();
			if(key.equals(pKey))
			{
				keySet.remove(pKey);
				Object value = valueList.get(count);
				valueList.remove(count);
				length--;
				return value;
			}
			count++;
		}
		return null;
	}
}