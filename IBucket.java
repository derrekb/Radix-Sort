package RADIX_SORT;
//Interface for Bucket Interface

public interface IBucket {
	//Purpose: To add the given element to this bucket
	//Effect: The bucket has the given element as its last element added 
	public void add(int elem);
	//Purpose: To get an element from this bucket
	public int get(int i);
	//Purpose: To determine if this bucket is empty
	public boolean ISEMPTY();
	//Purpose: To determine the size of this bucket
	public int SIZE();
	//Purpose: To dump the elements in this bucket
	public void CLEAR();
	//Purpose: Place bucket elements into the give array starting at index i
	public void toArray(int[] A, int i);
	
}
