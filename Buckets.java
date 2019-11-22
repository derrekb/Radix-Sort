package RADIX_SORT;

/**
 *Class for Buckets
 *Variables: zero,one,two,....,nine ==> Buckets for values with 
 *										an nthDigit of [1,2,....,9] respectively
 */
public class Buckets implements IBuckets{
	//Variables
	IBucket zero,one,two,three,four,five,six,seven,eight,nine;
	
	//Purpose: Implements	 a Buckets
	//Buckets ==> A Buckets is a collection of Bucket(s) 
	public Buckets() {
		zero = new Bucket();
		 one = new Bucket();
		 two = new Bucket();
		 three = new Bucket();
		 four = new Bucket();
		 five = new Bucket();
		 six = new Bucket();
		 seven = new Bucket();
		 eight = new Bucket();
		 nine = new Bucket();	}

	//Purpose: To add items in an array into this Buckets
	public void add(int[] n, int index) {
		//n ==> Inputed array from user
		//index ==> nth digit of an element in array n
		//i ==> index of array n
		int i = 0;
		while(i< n.length) {
			if(Radix.nthDigit(n[i], index) == 0) {
				zero.add(n[i]);	}
			else if(Radix.nthDigit(n[i], index) == 1) {
				one.add(n[i]);	}
			else if(Radix.nthDigit(n[i], index) == 2) {
				two.add(n[i]);	}
			else if(Radix.nthDigit(n[i], index) == 3) {
				three.add(n[i]);	}
			else if(Radix.nthDigit(n[i], index) == 4) {
				four.add(n[i]);	}
			else if(Radix.nthDigit(n[i], index) == 5) {
				five.add(n[i]);	}
			else if(Radix.nthDigit(n[i], index) == 6) {
				six.add(n[i]);	}
			else if(Radix.nthDigit(n[i], index) == 7) {
				seven.add(n[i]);	}
			else if(Radix.nthDigit(n[i], index) == 8) {
				eight.add(n[i]);	}
			else {nine.add(n[i]);} i++;	}}

	//Purpose: To dump elements in this Buckets to array A at index i
	public void toArray(int[] A, int i) {
		//i==> index in Array  
		zero.toArray(A, i);
		i = zero.SIZE();
		one.toArray(A, i);
		i = i + one.SIZE();
		two.toArray(A, i);
		i = i + two.SIZE();
		three.toArray(A, i);
		i = i + three.SIZE();
		four.toArray(A, i);
		i = i + four.SIZE();
		five.toArray(A, i);
		i = i + five.SIZE();
		six.toArray(A, i);
		i = i + six.SIZE();
		seven.toArray(A, i);
		i = i + seven.SIZE();
		eight.toArray(A, i);
		i = i + eight.SIZE();
		nine.toArray(A, i);			}
		
	//Purpose: To empty all elements in this Buckets
	//Effect: Empties all Buckets contained in this Buckets
	public void CLEAR() {
		zero.CLEAR();
		one.CLEAR();
		two.CLEAR();
		three.CLEAR();
		four.CLEAR();
		five.CLEAR();
		six.CLEAR();
		seven.CLEAR();
		eight.CLEAR();
		nine.CLEAR();		}
		}
