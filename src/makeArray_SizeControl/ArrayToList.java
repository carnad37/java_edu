package makeArray_SizeControl;

public class ArrayToList
{	
	private final static boolean OUT_RANGE = false;
	private final static boolean PASS = true;
	private final static boolean NOT_HAVE = false;
	private final static boolean HAVE = true;
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
		if (length == EMPTY)
		{
			length++;
			array[0] = element;
			return true;
		}
		length++;		
		if ((length != 1) && (length % ARRAY_UNIT == 1))
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
	
	public void add(int index, Object element)
	{
		boolean indexCheck = indexChecker(index);
		if (indexCheck == OUT_RANGE)
		{
			System.out.println("인덱스 범위를 벗어났습니다.");
			return;
		}
		length++;
		if ((length != 1)&&(length % ARRAY_UNIT == 1))
		{
			Object[] postArray = setNewArrayList();
			for (int i = 0; i < index; i++)
			{
				postArray[i] = array[i];
			}
			for (int i = index + 1; i<length; i++)
			{
				postArray[i] = array[i - 1];
			}
			postArray[index] = element;
			array = postArray;	
			return;
		}
		for (int i = length - 1; i>=index; i--)
		{
			array[i + 1] = array[i];
		}
		array[index] = element;	
	}
	
	public Object set(int index, Object element)
	{
		boolean indexCheck = indexChecker(index);
		if (indexCheck == OUT_RANGE)
		{
			return null;
		}
		Object preWord = array[index];
		array[index] = element;	
		return preWord;
	}
	
	public boolean contains(Object target)
	{
		for (Object element : array)
		{
			if (target.equals(element))
			{
				return true;
			}
		}
		return false;
	}
	
	public Object get(int index)
	{
		boolean indexCheck = indexChecker(index);
		if (indexCheck == OUT_RANGE)
		{
			return null;
		}
		Object element = array[index];
		return element;
	}
	
	public int getArraySize()
	{
		return array.length;
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
	
	public Object remove(int index)
	{
		boolean indexCheck = indexChecker(index);
		if (length == EMPTY || indexCheck == OUT_RANGE)
		{
			System.out.println("인덱스의 범위를 벗어났습니다.");
			return null;
		}
		length--;
		Object element = array[index];
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
			return element;
		}
		
//		if (length == 0)	// 모든 배열이 사라지는 경우.
//		{
//			clear();
//			return element;
//		}

		for (int i = index; i < (length - 2); i++)	//일반적인 경우
		{
			array[i] = array[i + 1];
		}
		array[length] = null;		

		return element;
	}
	
	private boolean indexChecker(int index)
	{
		if (index > (length - 1))
		{
			System.out.println("인덱스의 범위를 벗어났습니다.");

			return OUT_RANGE;
		}
		if (index < 0)
		{
			System.out.println("인덱스의 범위를 벗어났습니다.");

			return OUT_RANGE;
		}
		return PASS;
		
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
				
//				if (length == EMPTY)
//				{
//					clear();
//					return HAVE;
//				}
								
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
}
