package RADIX_SORT;

/**
 *Class for Buckets
 *Variables: [minusnine,minuseight,...,minuszero,zero,one,two,....,nine]
 *			 ==> Buckets for values with an nthDigit of [-9,-8,.......,9] 
 *				respectively
 */
public class Buckets implements IBuckets{
	//Variables
	IBucket zero,one,two,three,four,five,six,seven,eight,nine;
	IBucket minusnine,minuseight,minusseven,minussix,minusfive;
	IBucket minusfour,minusthree,minustwo,minusone,minuszero;
	
	//Purpose: Implements a Buckets
	//Buckets ==> A Buckets is a collection of Bucket(s) 
	public Buckets() {
		minusnine = new Bucket();
		minuseight = new Bucket();
		minusseven = new Bucket();
		minussix = new Bucket();
		minusfive = new Bucket();
		minusfour = new Bucket();
		minusthree = new Bucket();
		minustwo = new Bucket();
		minusone = new Bucket();
		minuszero = new Bucket();
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
			//INV: this.Bucket[zero[n[i-1] if (nthDigit(n[i-1],index)=0)],
		     //	,...,nine[n[i-1] if (nthDigit(n[i-1], index)= 9)],...
			//...,minuszero[n[i-1] if (nthDigit(n[i-1], index)= 100)] &&
		    //0<=i<=n.length, i == i
			while(i< n.length) {
				//INV: this.Bucket[zero[n[i-1] if (nthDigit(n[i-1],index)=0)],
			     //	,...,nine[n[i-1] if (nthDigit(n[i-1], index)= 9)],...
				//...,minuszero[n[i-1] if (nthDigit(n[i-1], index)= 100)] &&
			    //0<=i<=n.length, i == i
				//conditions starts
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
				else if(Radix.nthDigit(n[i], index) == 9){
					nine.add(n[i]);} 
				else if(Radix.nthDigit(n[i], index) == -10) {
					minusnine.add(n[i]);	}
				else if(Radix.nthDigit(n[i], index) == -9) {
					minuseight.add(n[i]);	}
				else if(Radix.nthDigit(n[i], index) == -8) {
					minusseven.add(n[i]);	}
				else if(Radix.nthDigit(n[i], index) == -7) {
					minussix.add(n[i]);	}
				else if(Radix.nthDigit(n[i], index) == -6) {
					minusfive.add(n[i]);	}
				else if(Radix.nthDigit(n[i], index) == -5) {
					minusfour.add(n[i]);	}
				else if(Radix.nthDigit(n[i], index) == -4) {
					minusthree.add(n[i]);	}
				else if(Radix.nthDigit(n[i], index) == -3) {
					minustwo.add(n[i]);	}
				else if(Radix.nthDigit(n[i], index) == -2) {
					minusone.add(n[i]);	}
				else {minuszero.add(n[i]);	}
				//conditions ends
				//INV: this.Bucket[zero[n[i] if (nthDigit(n[i],index)=0)],
			     //	,...,nine[n[i] if (nthDigit(n[i], index)= 9)],...
				//...,minuszero[n[i] if (nthDigit(n[i], index)= 100)] &&
			    //0<=i<=n.length, i == i
				i++;	
				//INV: this.Bucket[zero[n[i-1] if (nthDigit(n[i-1],index)=0)],
			     //	,...,nine[n[i-1] if (nthDigit(n[i-1], index)= 9)],...
				//...,minuszero[n[i-1] if (nthDigit(n[i-1], index)= 100)] &&
			    //0<=i<=n.length, i == i+1
				//Which implies:
				//INV: this.Bucket[zero[n[i-1] if (nthDigit(n[i-1],index)=0)],
			     //	,...,nine[n[i-1] if (nthDigit(n[i-1], index)= 9)],...
				//...,minuszero[n[i-1] if (nthDigit(n[i-1], index)= 100)] &&
			    //0<=i<=n.length, i == i
				}
			//INV: this.Bucket[zero[n[i] if (nthDigit(n[i],index)=0)],
		     //	,...,nine[n[i] if (nthDigit(n[i], index)= 9)],...
			//...,minuszero[n[i] if (nthDigit(n[i], index)= 100)] &&
		    //0<i<=n.length, i == n.length
			/**Termination Argument: i starts at 0 and increments each time
			 * 						through the loop. Eventually i = n.length
			 * 						and the loop terminates 
			 */
		}

	//Purpose: To dump elements in this Buckets to array A at index i
		public void toArray(int[] A, int i) {
			//i==> index in Array 
			minusnine.toArray(A, i);
			i = minusnine.SIZE();
			minuseight.toArray(A, i);
			i = i + minuseight.SIZE();
			minusseven.toArray(A, i);
			i = i + minusseven.SIZE();
			minussix.toArray(A, i);
			i = i + minussix.SIZE();
			minusfive.toArray(A, i);
			i = i + minusfive.SIZE();
			minusfour.toArray(A, i);
			i = i + minusfour.SIZE();
			minusthree.toArray(A, i);
			i = i + minusthree.SIZE();
			minustwo.toArray(A, i);
			i = i + minustwo.SIZE();
			minusone.toArray(A, i);
			i = i + minusone.SIZE();
			minuszero.toArray(A, i);
			i = i + minuszero.SIZE();
			zero.toArray(A, i);
			i = i + zero.SIZE();
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
		minusnine.CLEAR();
        minuseight.CLEAR();
        minusseven.CLEAR();
        minussix.CLEAR();
        minusfive.CLEAR();
        minusfour.CLEAR();
        minusthree.CLEAR();
        minustwo.CLEAR();
        minusone.CLEAR();
        minuszero.CLEAR();
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

	
