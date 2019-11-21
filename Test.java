package radixSort;

import static org.junit.jupiter.api.Assertions.*;

class Test {

	@org.junit.jupiter.api.Test
	void test() {
	    int x= 1234;
	    int x1 = -1234;
	    int y= 9;
	    int y1 = -9;
	    int [] z= {284, 7, 13020,6,65,3};
	    int[] z1 = {-1,1,2,-2,33,3,-8};
	    int[] z2 = {};

	    assertEquals( Radix.nthDigit(x,  1), 4);
	    assertEquals( Radix.nthDigit(x1,  1), -4);
	    assertEquals(Radix.getLength(y),1);
	    assertEquals(Radix.getLength(y1),1);
	    assertEquals(Radix.getLargest(z,0,5),5);
	    assertEquals(Radix.getLargest(z1,0,6),2);
	    //assertEquals(Radix.getLargest(z2,0,0),0);  needs to work with empty array
	    assertEquals(Radix.getSmallest(z, 0, 5),1);
	}

}
