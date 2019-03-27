package makeArray_Basic;

public class ArrayToList 
{	
	private final static boolean OUT_RANGE = false;
	private final static boolean PASS = true;
	private final static int EMPEY = 0;

	private int length;
	private Object[] array;
	
	public ArrayToList()
	{
		clear();
	}
	
	public boolean add(Object element)
	{
		if(length==EMPEY)
		{
			length++;
			array[0] = element;
			return true;
		}

		length++;
		
//		Object[] postArray = new E[length];	
		Object[] postArray =  new Object[length];
		
		for(int i=0;i<length-1;i++)
		{
			postArray[i] = array[i];
		}
		postArray[length-1] = element;
		array = postArray;
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
		Object[] postArray =  new Object[length];
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
		if(length==EMPEY)
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
		this.length = EMPEY;
		array =   new Object[length+1];
	}
	
	public Object remove(int index)
	{
		boolean indexCheck = indexChecker(index);
		if(length==EMPEY||indexCheck==OUT_RANGE)
		{
			System.out.println("ÀÎµ¦½ºÀÇ ¹üÀ§¸¦ ¹þ¾î³µ½À´Ï´Ù.");
			return null;
		}
		length--;
		if(length==0)
		{
			clear();
			return null;
		}
		Object element = array[index];
		Object[] postArray =  new Object[length];
		for(int i=0;i<index;i++)
		{
			postArray[i] = array[i];
		}
		for(int i=index;i<length;i++)
		{
			postArray[i] = array[i+1];
		}
		array = postArray;
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
				if(length==0)
				{
					clear();
					return true;
				}
				Object[] postArray =  new Object[length];
				
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
}
