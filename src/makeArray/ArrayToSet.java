package makeArray;

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

public class ArrayToSet<E> implements Iterable<E>
{
	private final static boolean PASS = true;
	private final static int EMPTY = 0;
	
	private int length;
	private E[] array;	
	
	public boolean contains(E target)
	{
		for(E element : array)
		{
			if(target.equals(element))
			{
				return true;
			}
		}
		return false;
	}
	
	public ArrayToSet()
	{
		clear();
	}
	
	public boolean add(E pElement)
	{
		if(length==EMPTY)
		{
			length++;
			array[0] = pElement;
			return true;
		}

		for(E element : array)
		{
			if(element.equals(pElement))
			{
				return false;
			}
		}
		
		length++;
		
		E[] postArray = (E[]) new Object[length];
		
		for(int i=0;i<length-1;i++)
		{
			postArray[i] = array[i];
		}
		postArray[length-1] = pElement;
		array = postArray;
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
		array =  (E[]) new Object[length+1];
	}
	
	public boolean remove(E target)
	{
		int index = 0;
		for(index=0;index<length;index++)
		{
			E element = array[index];
			if(target.equals(element))
			{
				length--;
				if(length==EMPTY)
				{
					clear();
					return true;
				}
				E[] postArray = (E[]) new Object[length];
				
				for(int j=0;j<index;j++)
				{
					postArray[j] = array[j];
				}
				
				for(int j=index;j<length;j++)
				{
					postArray[j] = array[j+1];	
				}

				array = postArray;
				return true;
			}
		}
		return false;
	}	
	@Override
	public Iterator<E> iterator() {
		Iterator<E> iterator = new Iteratorimpl<E>(array, length);
		return iterator;
	}
}
