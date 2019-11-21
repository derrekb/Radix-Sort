package RADIX_SORT;

public class Radix {
	//Purpose: To return the digit at the given index of the input number,
    //Example: getDigit(1234, 1) would return 4, getDigit(1234, 2) would return 3
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
    	{return String.valueOf(n).length()-1;}
    }


    //Purpose: To calculate the length of the longest number in a vector of
   //Purpose: To calculate the length of the longest number in a vector of
     //         natural numbers.
 public static int getLargest(int[] n, int index) {
     int accum = 0;
	 if (index == -1) return accum;
     else if (accum < getLength(n[index])) {
         accum = getLength(n[index]);
    	 return accum;
     }
     else return getLargest(n, index-1);
 }
 
 //Purpose: To calculate the length of the shortest number in a vector of
//Purpose: To calculate the length of the shortest number in a vector of
  //         natural numbers.
public static int getSmallest(int[] n, int index) {
	int accum = getLargest(n, n.length-1); 
  if (index == -1) return accum;
  else if (accum > getLength(n[index])) {
      accum = getLength(n[index]);
      return accum;
  }
  else return getSmallest(n, index-1);
}





//to create a random array with a random size with random values
public static int[] randomArr() {
	
	int index = 0;
	int a = 10 + (int) (Math.random()*30);// just to get a decent sample size
	int[] arr = new int[a];
	
while(index <= (a - 1)) {
	
	arr[index] = (int)Math.floor(Math.random()*100);
	index++;
}
return(arr);
}
}
