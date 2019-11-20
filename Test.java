package radixSort;

import static org.junit.jupiter.api.Assertions.*;

class Test {

	@org.junit.jupiter.api.Test
	void test() {
		int x= 1234;
	    int y= 9;
	    Integer[] z= {225,450,666,777,1295869};

	    assertEquals( Radix.nthDigit(x,  1), 4 );
	    assertEquals(Radix.getLength(9),1);
	    assertEquals(Radix.getLargest(z,666,4),3);
	}

}
