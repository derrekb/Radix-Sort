package radixSort;

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
 
   //Purpose: To sort Array A starting from index
   public static int[] sort(int[] A, int index) {
	    //To obtain element in A with largest digit size
    	int largest = getLargest(A, A.length-1);
    	//Bucket to add elements and dump elements from
    	IBuckets b = new Buckets();
    	//i ==> nth digit of element in an Array A
    	int i = 1;
    	while(i<= largest+1) {
    		b.add(A, i);
    		b.toArray(A, index);
    		b.CLEAR();
    		i++;  	}
    	return A;   }
   
   //Purpose: To sort Array A starting from index
   public static int[] sort1(int[] A, int index) {
	    //To obtain element in A with largest digit size
    	int largest = getLargest(A, A.length-1);
    	//Bucket to add elements and dump elements from
    	IBuckets b = new Buckets();
    	//i ==> nth digit of element in an Array A
    	int i = 1;
    	while(i<= largest+1) {
    		b.add(A, i);
    		b.toArray(A, index);
    		//b.CLEAR();
    		i++;  	}
    	return A;   }
   
   //Purpose: To create a random array with a random size with random values
   public static int[] randomArr() {
		int index = 0;
		int a = (int) (Math.random()*30);
		// just to get a decent sample size
		int[] arr = new int[a];	
		while(index <= (a - 1)) {
			arr[index] = (int)Math.floor(Math.random()*-1000);
			index++;}
			return(arr);}
   
   public static void main(String[] args) {
		int a[] = randomArr();
		System.out.println("This is the random array before sorting: " + Arrays.toString(a));
		System.out.println("This is the random array after sorting: " + Arrays.toString(Radix.sort(a,0)));
	}
   
     
}