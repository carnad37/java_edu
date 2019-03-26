package makeArray_SizeControl;

import java.util.Iterator;

class Iteratorimpl<E> implements Iterator<E>
{
	final static boolean EMPTY = false;
	
	int index;
	int length;
	private E[] array;	
	
	public Iteratorimpl(E[] array, int length)
	{
		this.array = array;
		this.index = 0;
		this.length = length;
	}
	
	public E next()
	{
		boolean check = hasNext();
		if(check==EMPTY)
		{
			return null;
		}
		E element = array[index];
		index++;
		return element;
	}
	public boolean hasNext()
	{
		if(index==length)
		{
			return false;
		}
		return true;
	}
}

public class ArrayToSet
{
//	private final static boolean PASS = true;
	private final static int EMPTY = 0;
	private static final int ARRAY_UNIT = 10;
	
	private int length;
	private Object[] array;	
	
	public ArrayToSet()
	{
		clear();
	}
	
	public boolean contains(Object target)
	{
		for(Object element : array)
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
		if(length==EMPTY)
		{
			length++;
			array[0] = element;
			return true;
		}
		for(int i=0;i<length;i++)
		{
			if(array[i].equals(element))
			{
				return false;
			}
		}
		length++;
		if(length%ARRAY_UNIT==0)
		{
			int mul = length/ARRAY_UNIT;
			int arraySize = (mul+1)*ARRAY_UNIT;
			Object[] postArray = new Object[arraySize];
			
			for(int i=0;i<length-1;i++)
			{
				postArray[i] = array[i];
			}
			postArray[length-1] = element;
			array = postArray;
			return true;
			
		}		
		array[length-1] = element;
		return true;
	}
	
	
	public boolean isEmpty()
	{
		if(length==EMPTY)
		{
			return true;
		}
		return false;
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
		for(index=0;index<length;index++)
		{
			Object element = array[index];
			if(target.equals(element))
			{
				length--;
				if(length==EMPTY)
				{
					clear();
					return true;
				}
									
				for(int i=index;i<length-2;i++)
				{
					array[i]=array[i+1];
				}
				array[length] = null;

				return true;
			}
		}
		return false;
	}	
	public Iterator<Object> iterator() {
		Iterator<Object> iterator = new Iteratorimpl<Object>(array, length);
		return iterator;
	}
}
