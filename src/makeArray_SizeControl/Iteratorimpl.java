package makeArray_SizeControl;

import java.util.Iterator;

public class Iteratorimpl<E> implements Iterator<E>
{
	final static boolean EMPTY = false;
	
	int readIndex;
	int length;
	private E[] array;	
	
	public Iteratorimpl(E[] array, int length)
	{
		this.array = array;
		this.readIndex = 0;
		this.length = length;
	}
	
	public E next()
	{
		boolean check = hasNext();
		if(check == EMPTY)
		{
			return null;
		}
		E element = array[readIndex];
		readIndex++;
		return element;
	}
	
	public boolean hasNext()
	{
		if(readIndex == length)
		{
			return false;
		}
		return true;
	}
}
