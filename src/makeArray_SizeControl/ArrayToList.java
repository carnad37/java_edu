package makeArray_SizeControl;

public class ArrayToList
{	
	private final static boolean OUT_RANGE = false;
	private final static boolean PASS = true;
	private final static int EMPTY = 0;
	private final static int ARRAY_UNIT = 10;

	private int length;
	private Object[] array;
	
	public ArrayToList()
	{
		clear();
	}
	
	public boolean add(Object element)
	{
		if(length==EMPTY)
		{
			length++;
			array[0] = element;
			return true;
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
	
	public void add(int index, Object element)
	{
		boolean indexCheck = indexChecker(index);
		if(indexCheck==OUT_RANGE)
		{
			System.out.println("ÀÎµ¦½º ¹üÀ§¸¦ ¹þ¾î³µ½À´Ï´Ù.");
			return;
		}
		length++;
		if(length%ARRAY_UNIT==0)
		{
			int mul = length/ARRAY_UNIT;
			int arraySize = (mul+1)*ARRAY_UNIT;
			Object[] postArray = new Object[arraySize];
			for(int i=0;i<index;i++)
			{
				postArray[i] = array[i];
			}
			for(int i=index+1;i<length;i++)
			{
				postArray[i] = array[i-1];
			}
			postArray[index] = element;
			array = postArray;	
			return;
		}
		for(int i=length-1;i>=index;i--)
		{
			array[i+1]=array[i];
		}
		array[index] = element;	
	}
	
	public Object set(int index, Object element)
	{
		boolean indexCheck = indexChecker(index);
		if(indexCheck==OUT_RANGE)
		{
			return null;
		}
		Object preWord = array[index];
		array[index] = element;	
		return preWord;
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
	
	public Object get(int index)
	{
		boolean indexCheck = indexChecker(index);
		if(indexCheck==OUT_RANGE)
		{
			return null;
		}
		Object element = array[index];
		return element;
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
	
	public Object remove(int index)
	{
		boolean indexCheck = indexChecker(index);
		if(length==EMPTY||indexCheck==OUT_RANGE)
		{
			System.out.println("ÀÎµ¦½ºÀÇ ¹üÀ§¸¦ ¹þ¾î³µ½À´Ï´Ù.");
			return null;
		}
		length--;
		Object element = array[index];
		if(length==0)
		{
			clear();
			return element;
		}
		for(int i=index;i<length-2;i++)
		{
			array[i]=array[i+1];
		}
		array[length] = null;		
		return element;
	}
	
	private boolean indexChecker(int index)
	{
		if(index>(length-1))
		{
			System.out.println("ÀÎµ¦½ºÀÇ ¹üÀ§¸¦ ¹þ¾î³µ½À´Ï´Ù.");

			return OUT_RANGE;
		}
		if(index<0)
		{
			System.out.println("ÀÎµ¦½ºÀÇ ¹üÀ§¸¦ ¹þ¾î³µ½À´Ï´Ù.");

			return OUT_RANGE;
		}
		return PASS;
		
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
}
