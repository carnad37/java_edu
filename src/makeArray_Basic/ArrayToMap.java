package makeArray_Basic;

public class ArrayToMap<K,V>
{
	private final static int EMPTY = 0;

	//key�� �ε����� valueã��.
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
