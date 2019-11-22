package RADIX_SORT;

import java.util.Iterator;

public interface IBucket {
	//Purpose: To add the given element to this bucket
	//Effect: The bucket has the given element as its last element added 
	public void add(int elem);
	public int get(int i);
	public boolean ISEMPTY();
	public int SIZE();
	public void CLEAR();
	
	//Purpose: Place bucket elements into the give array starting at index i
	//Effect: Clears the bucket
	public void toArray(int[] A, int i);
}
