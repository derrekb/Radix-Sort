package RADIX_SORT;

import java.util.Arrays;

public class Test {
	public static void main(String args[]) {
		int[] A = Radix.randomArr();
		System.out.println("Array before sorting with Radix");
		System.out.println(Arrays.toString(A));
		System.out.println("Array after sorting with Radix");
		System.out.println(Arrays.toString(Radix.sort(A, 0)));
		}
}
	