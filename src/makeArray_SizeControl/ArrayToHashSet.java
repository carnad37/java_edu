package makeArray_SizeControl;

import java.util.Iterator;


public class ArrayToHashSet
{
//	private final static boolean PASS = true;
	private final static int EMPTY = 0;
	private static final int ARRAY_UNIT = 10;
	private final static boolean NOT_HAVE = true;
	private final static boolean HAVE = false;
	
	private int length;
	private Object[] array;	
	
	public ArrayToHashSet()
	{
		clear();
	}
	
	public boolean contains(Object target)
	{
		for (Object element : array)
		{
			if(target.equals(element))
			{
				return true;
			}
		}
		return false;
	}
	
	public boolean add(Object element)
	{
		if (length == EMPTY)
		{
			length++;
			array[0] = element;
			return true;
		}
		length++;		
		if ((length != 1)&&(length % ARRAY_UNIT == 1))
		{
			Object[] postArray = setNewArrayList();			
			for (int i = 0; i < (length - 1); i++)
			{
				postArray[i] = array[i];
			}
			postArray[length - 1] = element;
			array = postArray;
			return true;
		}		
		array[length - 1] = element;
		return true;
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
	
	public void clear()
	{
		this.length = EMPTY;
		array = new Object[ARRAY_UNIT];
	}
	
	public boolean remove(Object target)
	{
		int index = 0;
		for (index = 0; index < length; index++)
		{
			Object element = array[index];
			if (target.equals(element))
			{
				length--;
				if (length % ARRAY_UNIT == 9)	// 단위 밑으로 줄어드는 경우
				{
					Object[] postArray = setNewArrayList();
					for (int i = 0; i < index; i++)
					{
						postArray[i] = array[i];
					}
					for (int i = index; i<length; i++)
					{
						postArray[i] = array[i + 1];
					}
					array = postArray;	
					return HAVE;
				}

				for (int i = index; i<length - 2; i++)
				{
					array[i] = array[i + 1];
				}
				array[length] = null;

				return HAVE;
			}
		}
		return NOT_HAVE;
	}
	
	private Object[] setNewArrayList()
	{
			int mul = length / ARRAY_UNIT;
			int arraySize = (mul + 1) * ARRAY_UNIT;
			Object[] postArray = new Object[arraySize];
			return postArray;			
	}	
	
	public Iterator<Object> iterator() {
		Iterator<Object> iterator = new Iteratorimpl<Object>(array, length);
		return iterator;
	}
}
