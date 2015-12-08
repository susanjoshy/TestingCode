// Write a program to print 1 to 10 numbers without using loops
//and you should not have more than 1 print statement.

package programlist;

import java.util.Arrays;

public class PrintWithoutLoop {
	public static void main(String[] args) {
	    Object[] numbers = new Object[10];
	    Arrays.fill(numbers, new Object() {
	        private int count = 0;
	        @Override
	        public String toString() {
	            return Integer.toString(++count);
	        }
	    });
	    System.out.println(Arrays.toString(numbers));
	}

}
