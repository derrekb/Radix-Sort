package RADIX_SORT;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class Radix_Sort_Test {

	@Test
	void Radix() {
		int x= 1234;
	    int[] z= {225,450,666,777,1295869};
	    int[] a = {43,657,2,543,2355,240};
	    int[] b = {2,43,240,543,657,2355};
	    int[] mt = {};
	    int[] same = {2,2,2,2,2};
	    int[] e = {-42,-2,-342,-642,-232};
	    int[] f = {-642,-342,-232,-42,-2};
	    int[] c = {2,43,657,-240,-923,-543,2355,10,-10}; 
	    int[] d = {-923,-543,-240,-10,2,10,43,657,2355};
	   
	    
	    assertEquals(Radix.nthDigit(x,1), 4 );
	    assertEquals(Radix.getLength(9),1);
	    assertEquals(Radix.getLargest(z,4),7);
	    assertEquals(Arrays.equals(Radix.sort(a,0), b), true);
	    assertEquals(Arrays.equals(Radix.sort(mt,0), mt), true);
	    assertEquals(Arrays.equals(Radix.sort(same, 0), same),true);
	    assertEquals(Arrays.equals(Radix.sort(c, 0), d), true);
	    assertEquals(Arrays.equals(Radix.sort(e, 0), f), true);
	   
	    
	    
		     }
	
	@Test
	void Bucket() {
		IBucket B= new Bucket();
		B.add(0);
		B.add(1);
		B.add(2);
		B.add(3);
		int X[] = {0,0,0,0};
		B.toArray(X,0);
		assertEquals(Arrays.equals(X, new int[] {0,1,2,3}), true);
		//assertEquals(B.size, 0); //Need selector to test this
	}
	
	@Test
	void Buckets() {
		Buckets b = new Buckets();
		int [] z= {225,450,666,50,777,1295869};
		int [] y= {450,50,225,666,777,1295869};
		b.add(z, 1);
		
		int [] x= {0,0,0,0,0,0};
		assertEquals(b.five.get(0), 225);
		assertEquals(b.zero.get(0), 450);
		assertEquals(b.six.get(0), 666);
		assertEquals(b.seven.get(0), 777);
		assertEquals(b.nine.get(0), 1295869);
		b.toArray(x,0);
		assertEquals(Arrays.equals(x, y), true);
		
	}

}
