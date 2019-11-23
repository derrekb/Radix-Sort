package RADIX_SORT;
import java.util.*;

/**
 * Class for Bucket
 *Purpose: Implements a bucket
 *Variables: B ==> Array List
 *			size => length of Bucket
 */
public class Bucket implements IBucket{
	//Variables
	List<Integer> B;
	int size;
	
	//Purpose: To implement a Bucket
	public Bucket() {
		B = new ArrayList<Integer>();
		size = this.SIZE();}
	
	//Purpose: To add an element to a Bucket
	public void add(int elem) {
		B.add(elem);
		size = this.SIZE();	}
	
	//Purpose: To get an element from a Bucket
	public int get(int i) {
		return (int) B.get(i);	}
	
	//Purpose: To determine if Bucket is empty
	public boolean ISEMPTY() {
		return B.isEmpty();	}
	
	//Purpose: To determine the size of this Bucket
	public int SIZE() {
		return B.size();	}	
	
	//Purpose: To empty all elements in this Bucket
	public void CLEAR() {
		B.clear();
		size = this.SIZE();	}
	
	//Purpose: To dump all elements in this Bucket to an Array
	public void toArray(int[] A, int i) {
		toArrayHelper(A, i, i+this.size-1);	}
	
	//Purpose: To dump b into A in the given vector interval
	//Assumption: size == upper-lower+1
	private void toArrayHelper(int[] A, int lower, int upper) {
		int k=0;
		//Purpose: To index of the next bucket element to dump into A
		int next = lower;
		//Purpose: The next index of A to dump an element into
		//INV: lower <= next <= (upper+1) && k = next - lower 
		// && A[lower.next-1] == b[0...k-1]
		while(next <= upper) {
			//lower<=next <= upper && k = next-lower &&
			// A[lower...next-1] == b[0...k-1]
			A[next] = (int) B.get(k);
			//lower<=next <= upper && k = next-lower &&
			// A[lower...next] == b[0...k]
			next = next + 1;
			//lower<=next <= (upper+1) && k = next-1 - lower &&
			// A[lower...next-1] == b[0...k]
			k = k + 1;
			//lower<=next <= (upper + 1) && k = next-lower &&
			// A[lower...next-1] == b[0...k-1]
		}
		//lower<=next <= (upper+1) && k = next-lower &&
		// A[lower...next-1] == b[0...k-1] && next > upper
		//==> next == upper + 1 ==> k == upper + 1 - lower ==>
		//A[lower...upper]==b[0...size-1]
		/**Termination Argument: next starts at lower and increments each
		 * 						time through the loop. Eventually
		 * 						next > upper and the loop terminates 
		 */
		}
	
}

	