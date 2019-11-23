package RADIX_SORT;
//Interface for Buckets
public interface IBuckets {
	
		//Purpose: To add the given element to this bucket
		//Effect: The bucket has the given element as its last element added 
		public void add(int[] n, int index) ;
		
		//Purpose: Place Buckets elements into the given array at index i
		public void toArray(int[] A, int i);
		
		//Purpose: To empty a List Bucket
		public void CLEAR();
		
		}
