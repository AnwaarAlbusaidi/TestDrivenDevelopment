import java.util.ArrayList;
import java.util.HashMap;

public class Testing {

	public static void main(String[] args) {
		int[] arr = new int[] { 2, 3, 7, 6, 9, 4, 5, 7 };
		HashMap<String, ArrayList<Integer>> evenOddresult = new HashMap<String, ArrayList<Integer>>();
		evenOddresult = evenOrOddNumber(arr);
		System.out.println("Even or Odd number method");
		for (String current : evenOddresult.keySet())
			System.out.println(current + evenOddresult.get(current));

		System.out.println(reverse("this is a sentence"));
	}

	/**
	 * This method will take an array of numbers and search for even or odd numbers
	 * the power number
	 * 
	 * @param x(array of numbers)
	 * @return a hash map with the even and odd number
	 */
	public static HashMap<String, ArrayList<Integer>> evenOrOddNumber(int[] x) {
		HashMap<String, ArrayList<Integer>> evenOddNumber = new HashMap<String, ArrayList<Integer>>();
		ArrayList<Integer> evevNumber = new ArrayList<Integer>();
		ArrayList<Integer> oddNumber = new ArrayList<Integer>();
		for (int index = 0; index < x.length; index++) {
			if (x[index] % 2 == 0)
				evevNumber.add(x[index]);
			else
				oddNumber.add(x[index]);
		}
		evenOddNumber.put("even", evevNumber);
		evenOddNumber.put("odd", oddNumber);

		return evenOddNumber;
	}

	/**
	 * This method will take two numbers and calculate the power number
	 * 
	 * @param base
	 * @param exponent
	 * @return the power number base parameter
	 */
	public static int powerMethod(Integer base, Integer exponent) {
		int p = 1;
		for (int index = 1; index <= exponent; index++) {
			p = p * base;
		}

		return p;
	}

	/**
	 * This method will take a string and return the reverse string
	 * 
	 * @param word
	 * @return the reverse of the string
	 */
	public static String reverse(String word) {
		char ch[] = word.toCharArray();
		String revWord = "";
		for (int index = word.length() - 1; index >= 0; index--)
			revWord = revWord + ch[index];

		return revWord;
	}

}