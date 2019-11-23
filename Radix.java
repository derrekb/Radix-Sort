package RADIX_SORT;
import java.util.Arrays;

/**
 * Class for Radix_Sort
  */
public class Radix {
	//Purpose: To return the digit at the given index of the input number,
    //Effect: getDigit(1234, 1) would return 4, getDigit(1234, 2) would return 3
    //         and getDigit(5, 3) would return 0
    public static int nthDigit(int n, int index) {
        return Math.floorDiv((n % ((int) Math.pow(10, index))), ((int) Math.pow(10, index-1)));
    }

    //Purpose: To get the length of the given int n.
    //Example: 21 would return 2, 5 would return 1.
    public static int getLength(int n) {
    	if(n >= 0)
    		{return String.valueOf(n).length();}
    	else
    		{return String.valueOf(n).length()-1;}    }
  
   //Purpose: To calculate the length of the longest number in a vector of
   //natural numbers.
    public static int getLargest(int[] n, int index) {
	     int accum = 0;
		 if (index == -1)
		 	{return accum;}
	     else if (accum < getLength(n[index])) {
	         accum = getLength(n[index]);
	    	 return accum;	     }
	     else return getLargest(n, index-1); }
 
   //Purpose: To sort Array A starting from index
   public static int[] sort(int[] A, int index) {
	    //To obtain element in A with largest digit size
    	int largest = getLargest(A, A.length-1);
    	//Bucket to add elements and dump elements from
    	IBuckets b = new Buckets();
    	//Assumption: y == elements in Array A
    	//i ==> nth-digit of y
    	int i = 1;
    	//Assumption: y == elements in Array A, y == A[0 .... A.length-1]
    	
    	//A[y] ,where y is sorted in ascending order of value of
		//		value of nth digit(s) of y &&
		//i = i  &&
    	//b[] && 
		//nth-digit ==> i - 1
    	while(i<= (largest+1)) {
    		//A[y] ,where y is sorted in ascending order of value of
    		//		value of nth digit(s) of y &&
    		//i = i  &&
        	//b[] && 
    		//nth-digit => i - 1
    		b.add(A, i);
    		//A[y] , where y is not sorted &&
        	//i = i && 
    		//b[y], where y is sorted in ascending order of 
    		//				value of the nth digit(s) of y && 
    		//nth-digit ==> i 
    		b.toArray(A, index);
    		//A[y] ,where y is sorted in ascending order of value of
    		//		value of nth digit(s) of y && 
    		//i = i &&
        	//b[y], where y is sorted in ascending order of 
    		//		value of the nth digit(s) of y && 
    		//nth-digit ==> i 
    		b.CLEAR();
    		//A[y] ,where y is sorted in ascending order of value of
    		//		value of nth digit(s) of y &&
    		//i = i &&
        	//b[] && 
    		//nth-digit ==> i 
    		i++;  	   
    		//A[y] ,where y is sorted in ascending order of value of
    		//		value of nth digit(s) of y &&
    		//i = i + 1 &&
        	//b[] && 
    		//nth-digit ==> i - 1
    		//==> Which implies:
    		//A[y] ,where y is sorted in ascending order of value of
    		//		value of nth digit(s) of y &&
    		//i = i &&
        	//b[] && 
    		//nth-digit ==> i - 1
    	}
    	//A[y] ,where y is completely sorted in ascending order &&
		//i = largest + 2 &&
    	//b[] && 
		//nth-digit ==> i - 1
    	/**Termination Argument: i starts at 1 and increments each time
    	 * 						through the loop. Eventually, i > (largest+1)
    	 * 						and the loop terminates  
    	 */
    	return A;      	  }
   
   //Purpose: To generate a random Array with random size
   public static int[] randomArr() {
		int index = 0;
		int a = (int) (Math.random()*30);
		// To generate a decent sample size
		int[] arr = new int[a];	
		//To implement an array arr with size a
		//Assumption: let y be the values of randomly generated integers
		//INV: arr[0...index-1] && index = index
		while(index <= (a - 1)) {
			//INV: arr[0....index-1] && index = index
			arr[index] = (int)Math.floor(Math.random()*-1000);
			//INV: arr[0....index] && index = index
			index++;
			//INV: arr[0....index-1] && index = index + 1
			//which implies:
			//INV: arr[0....index-1] && index = index
		}
		/**Termination Argument: index starts zero and increments each time
		 * 						through the loop. Eventually index > a-1. And
		 * 						the loop terminates
		 */		
			return(arr);}
   
   
   
 }
