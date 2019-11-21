package RADIX_SORT;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class Radix_Sort_Test {

	@Test
	void Radix() {
		int x= 1234;
	    int y= 9;
	    int [] z= {225,450,666,777,1295869};
	    int [] p= {-5,450,666,777,1295869};

	    assertEquals(Radix.nthDigit(x,1), 4 );
	    assertEquals(Radix.getLength(9),1);
	    assertEquals(Radix.getLargest(z,4),7);
	    assertEquals(Radix.getSmallest(z,4),3);
	 //   assertEquals(Radix.getSmallest(p,4),1);
	  
	    }
	
	@Test
	void Bucket() {
		IBucket B= new Bucket();
		B.add(0);
		B.add(1);
		B.add(2);
		B.add(3);
		int X[] = {0,0,0,0};
		assertEquals(B.toArray(X, 0) , 4);
		//assertEquals(X, new Integer[] {0,1,2,3});
		//assertEquals(B.size, 0); //Need selector to test this
	}
	
	@Test
	void Buckets() {
		Buckets b = new Buckets();
		int [] z= {225,450,666,777,1295869};
		b.add(z, 1);
		assertEquals(b.five.get(0), 225);
		assertEquals(b.zero.get(0), 450);
		assertEquals(b.six.get(0), 666);
		assertEquals(b.seven.get(0), 777);
		assertEquals(b.nine.get(0), 1295869);
	}

}
