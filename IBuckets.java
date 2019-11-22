package RADIX_SORT;

public interface IBuckets {
		//Purpose: To add the given element to this bucket
		//Effect: The bucket has the given element as its last element added 
		public void add(int[] n, int index) ;
		
		//Purpose: Place bucket elements into the give array starting at indeint i
		//Effect: Clears the bucket
		public void toArray(int[] A);
		
		public void CLEAR();
}
