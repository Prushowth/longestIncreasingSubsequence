package longestIncreasingSubsequence;

import java.util.Arrays;

public class Array1 {
	
	public int[] newArray = {6,5,7,9,12,54,32,76,45,33,99};
	
	public void display() {
		System.out.println(Arrays.toString(newArray));
		for (int i=0;i<newArray.length;i++) {
			System.out.println(newArray[i]);
		}
		}
	public static void main (String[] args) {
		GreaterNumCheck ar2 = new GreaterNumCheck();
		ar2.numberCheck();
		
	
	}

}
