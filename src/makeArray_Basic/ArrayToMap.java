package makeArray_Basic;

public class ArrayToMap<K,V>
{
	private final static int EMPTY = 0;

	//key의 인덱스로 value찾기.
	ArrayToSet<Object> key;
//	ArrayToList<Object> value;
	int length;
	
	public ArrayToMap()
	{	
		clear();
	}
	
	public void clear()
	{		
		this.length = EMPTY;
		key = new ArrayToSet<Object>();
//		value = new ArrayToList<Object>();
	}
	
	
	
	
	
}
