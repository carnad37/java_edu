package makeArray_SizeControl;

public class ArrayToMap<K,V>
{
	private final static int EMPEY = 0;

	//key의 인덱스로 value찾기.
	K[] key;
	V[] value;
	int length;
	
	public ArrayToMap()
	{	
		this.length = EMPEY;
		Object[] objectArray = new Object[length+1];
		key = (K[])objectArray;
		value = (V[])objectArray;		
	}
	
}
