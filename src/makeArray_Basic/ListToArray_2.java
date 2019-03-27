package makeArray_Basic;

class makeArray<T>
{
	T[] t;
	makeArray()
	{
		
	}
}

public class ListToArray_2
{
	
	private int length;
	private String[] array;
	
	public ListToArray_2()
	{
		this.length = 1;
		array = new String[length];
	}
	
	public boolean add(String addWord)
	{
		if(length==1)
		{
			array[0] = addWord;
			return true;
		}
		length++;
		String[] postArray = new String[length];	
		for(int i=0;i<length-1;i++)
		{
			postArray[i] = array[i];
		}
		postArray[length-1] = addWord;
		array = postArray;
		return true;
	}
	
	public void add(int pIndex, String addWord)
	{
		if(pIndex>(length-1))
		{
			System.out.println("ÀÎµ¦½º ¹üÀ§¸¦ ¹þ¾î³µ½À´Ï´Ù.");
			return;
		}
		length++;
		String[] postArray = new String[length];	
		for(int i=0;i<pIndex;i++)
		{
			postArray[i] = array[i];
		}
		for(int i=pIndex+1;i<length;i++)
		{
			postArray[i] = array[i-1];
		}
		postArray[pIndex] = addWord;
		array = postArray;
	}
	
	public String set(int pIndex, String newWord)
	{
		if(pIndex>length)
		{
			System.out.println("ÀÎµ¦½º ¹üÀ§¸¦ ¹þ¾î³µ½À´Ï´Ù.");
			return null;
		}
		String preWord = array[pIndex];
		array[pIndex] = newWord;	
		return preWord;
	}
	
	public boolean contains(String target)
	{
		
		return true;
	}
	
	
	
	
	
}
