package radixSort;

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
            return String.valueOf(n).length();
        }


        //Purpose: To calculate the length of the longest number in a vector of
        //         natural numbers.
    public static int getLargest(Integer[] n, int greatest, int index) {
        if (index == -1) return greatest;
        else if (greatest < getLength(n[index])) {
            return getLargest(n, getLength(n[index]), index-1);
        }
        else return getLargest(n, greatest, index-1);
    }




}