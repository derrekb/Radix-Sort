package RADIX_SORT;
import java.util.Arrays;

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
 
    
   public static int[] sort(int[] A) {
    	int largest = getLargest(A, A.length-1);
    	IBuckets b = new Buckets();
    	int i = 1;
    	while(i<= largest+1) {
    		b.add(A, i);
    		b.toArray(A);
    		b.CLEAR();
    		i++;  	}
    	return A;   }
   
     
}
