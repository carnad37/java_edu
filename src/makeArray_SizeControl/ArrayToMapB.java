package makeArray_SizeControl;

import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ArrayToMapB
{
	private final static int EMPTY = 0;
	private static final int ARRAY_UNIT = 10;
	private final static boolean HAVE = false;
	private final static boolean NOT_HAVE = true;
	
	//key의 인덱스로 value찾기.
	private Object[] keySet;
	private Object[] valueList;
	private int length;
	
	public ArrayToMapB()
	{	
		//인덱스로 찾기
		clear();
	}
	
//	public Object put(Object key, Object value)
//	{
//		length++;
//		keySet.add(key);
//		valueList.add(value);
//		return value;
//	}
	
	public Object put(Object pKey, Object pValue)
	{
		if (length == EMPTY)
		{
			length++;
			keySet[0] = pKey;
			valueList[0] = pValue;
			return pValue;
		}
		
		for(int i=0; i<length; i++)
		{
			if (keySet[i].equals(pKey))
			{
				Object result = valueList[i];
				valueList[i] = pValue;
				return result;				
			}
		}
			
		length++;		
		keySet = add(keySet, pKey);
		valueList = add(valueList, pValue);

		return true;
	}
	
	private Object[] add(Object[] preArray, Object element)
	{
		if ((length != 1) && (length % ARRAY_UNIT == 1))
		{
			Object[] postArray = setNewArrayList();			
			for (int i = 0; i < (length - 1); i++)
			{
				postArray[i] = preArray[i];
			}
			postArray[length - 1] = element;
			preArray = postArray;
			return postArray;
		}		
		preArray[length - 1] = element;
		return preArray;
	}
	
	
	public boolean containsKey(Object key)
	{
		for (Object element : keySet)
		{
			if(key.equals(element))
			{
				return true;
			}
		}
		return false;
	}
	
	public boolean containsValue(Object value)
	{
		for (Object element : valueList)
		{
			if (value.equals(element))
			{
				return true;
			}
		}
		return false;

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
		for (int i = 0; i < length; i++)
		{
			Object key = keySet[i];
			Map.Entry<Object, Object> mapEntry= new MapEntryImpl<Object, Object>(key);
			Object value = valueList[i];
			mapEntry.setValue(value);
			objSet.add(mapEntry);
		}
		return objSet;
	}
	
	public Object get(Object pKey)
	{
		for (int i = 0; i < length; i++)
		{
			Object key = keySet[i];
			if (key.equals(pKey))
			{
				return valueList[i];
			}
		}
		return null;
	}
	
	public boolean isEmpty()
	{
		if (length == EMPTY)
		{
			return NOT_HAVE;
		}
		return HAVE;
	}
	
	public int size()
	{
		return length;
	}
	
	public Set<Object> keySet()
	{
		Set<Object> set = new HashSet<Object>();
		for(Object key : keySet)
		{
			set.add(key);
		}
		return set;
	}
	
	public Collection<Object> value()
	{
		Collection<Object> collection = new HashSet<Object>();
		for(Object value : valueList)
		{
			collection.add(value);
		}
		return collection;
	}
	
	public void clear()
	{
		this.length = EMPTY;
		keySet = new Object[ARRAY_UNIT];
		valueList = new Object[ARRAY_UNIT];
	}
	
	public Object remove(Object pKey)
	{
		for (int i = 0; i < length; i++)
		{
			if (keySet[i].equals(pKey))
			{
				length--;
				Object value = valueList[i];
				keySet = delete(keySet, i);
				valueList = delete(valueList, i);
				return value;
			}
		}
		return null;
	}
	
	private Object[] delete(Object[] preArray, int index)
	{
		if (length % ARRAY_UNIT == 9)	// 단위 밑으로 줄어드는 경우
		{
			Object[] postArray = setNewArrayList();
			for (int i = 0; i < index; i++)
			{
				postArray[i] = preArray[i];
			}
			for (int i = index; i<length; i++)
			{
				postArray[i] = preArray[i + 1];
			}
			return postArray;
		}

		for (int i = index; i<length - 2; i++)
		{
			preArray[i] = preArray[i + 1];
		}
		preArray[length] = null;

		return preArray;
	}

	private Object[] setNewArrayList()
	{
			int mul = length / ARRAY_UNIT;
			int arraySize = (mul + 1) * ARRAY_UNIT;
			Object[] postArray = new Object[arraySize];
			return postArray;			
	}	
}