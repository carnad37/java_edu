package makeArray_SizeControl;

import java.util.Map;

public class MapEntryImpl<K,V> implements Map.Entry<K,V>
{	
	K key;
	V value;
	
	public MapEntryImpl(K key)
	{
		this.key = key;
	}
	
	@Override
	public K getKey()
	{		
		return key;
	}

	@Override
	public V getValue()
	{
		return value;
	}

	@Override
	public V setValue(V value)
	{
		this.value = value;
		return value;
	}
}
