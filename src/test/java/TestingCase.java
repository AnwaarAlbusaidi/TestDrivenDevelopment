import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.HashMap;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class TestingCase {
	@Test
	@DisplayName("Empty array as an argument.")
	void testEvenOrOddNumber1() {
		Testing test = new Testing();
		int[] arr = new int[] {};
		HashMap<String, ArrayList<Integer>> evenOddNumber = new HashMap<String, ArrayList<Integer>>();
		ArrayList<Integer> evevNumber = new ArrayList<Integer>();
		ArrayList<Integer> oddNumber = new ArrayList<Integer>();
		evenOddNumber.put("even", evevNumber);
		evenOddNumber.put("odd", oddNumber);
		assertEquals(evenOddNumber, test.evenOrOddNumber(arr));
	}

	@Test
	@DisplayName("array with all even numbers.")
	void testEvenOrOddNumber2() {
		Testing test = new Testing();
		int[] arr1 = new int[] { 2, 4, 6, 8 };
		HashMap<String, ArrayList<Integer>> evenOddNumber = new HashMap<String, ArrayList<Integer>>();
		ArrayList<Integer> evevNumber = new ArrayList<Integer>();
		ArrayList<Integer> oddNumber = new ArrayList<Integer>();
		evevNumber.add(2);
		evevNumber.add(4);
		evevNumber.add(6);
		evevNumber.add(8);
		evenOddNumber.put("even", evevNumber);
		evenOddNumber.put("odd", oddNumber);
		assertEquals(evenOddNumber, test.evenOrOddNumber(arr1));
	}

	@Test
	@DisplayName("array with all odd numbers.")
	void testEvenOrOddNumber3() {
		Testing test = new Testing();
		int[] arr1 = new int[] { 2, 4, 6, 8 };
		HashMap<String, ArrayList<Integer>> evenOddNumber = new HashMap<String, ArrayList<Integer>>();
		ArrayList<Integer> evevNumber = new ArrayList<Integer>();
		ArrayList<Integer> oddNumber1 = new ArrayList<Integer>();
		int[] arr2 = new int[] { 3, 5, 7, 9 };
		oddNumber1.add(3);
		oddNumber1.add(5);
		oddNumber1.add(7);
		oddNumber1.add(9);
		evenOddNumber.put("even", evevNumber);
		evenOddNumber.put("odd", oddNumber1);
		assertEquals(evenOddNumber, test.evenOrOddNumber(arr2));
	}

	@Test
	@DisplayName("array with mixed even and odd numbers.")
	void testEvenOrOddNumber4() {
		Testing test = new Testing();
		int[] arr1 = new int[] { 2, 4, 6, 8 };
		HashMap<String, ArrayList<Integer>> evenOddNumber = new HashMap<String, ArrayList<Integer>>();
		ArrayList<Integer> evevNumber2 = new ArrayList<Integer>();
		ArrayList<Integer> oddNumber2 = new ArrayList<Integer>();
		int[] arr3 = new int[] { 2, 3, 7, 6, 9, 4, 5, 7 };
		evevNumber2.add(2);
		evevNumber2.add(6);
		evevNumber2.add(4);
		oddNumber2.add(3);
		oddNumber2.add(7);
		oddNumber2.add(9);
		oddNumber2.add(5);
		oddNumber2.add(7);
		evenOddNumber.put("even", evevNumber2);
		evenOddNumber.put("odd", oddNumber2);
		assertEquals(evenOddNumber, test.evenOrOddNumber(arr3));
	}

	@Test
	@DisplayName("null as an argument, instead of an array.")
	void testEvenOrOddNumber5() {
		Testing test1 = new Testing();
		int[] arr4 = null;
		assertThrows(NullPointerException.class, () -> {test1.evenOrOddNumber(arr4);});
	}

	@Test
	@DisplayName("base: 0, exponent: 0")
	void testPowerMethod1() {
		Testing test = new Testing();
		assertEquals(1, test.powerMethod(0, 0));
	}

	@Test
	@DisplayName("base: null, exponent: null")
	void testPowerMethod2() {
		Testing test = new Testing();
		assertThrows(NullPointerException.class, () -> {
			test.powerMethod(null, null);
		});
	}

	@Test
	@DisplayName("base: 2, exponent 3 ")
	void testPowerMethod3() {
		Testing test = new Testing();
		assertEquals(8, test.powerMethod(2, 3));
	}

	@Test
	@DisplayName("Take null as an argument.")
	void testReverse1() {
		Testing test = new Testing();
		assertThrows(NullPointerException.class, () -> {
			test.reverse(null);
		});
	}

	@Test
	@DisplayName("Take an empty string as as argument.")
	void testReverse2() {
		Testing test = new Testing();
		assertEquals("", test.reverse(""));
	}

	@Test
	@DisplayName("Take a string with only a single character.")
	void testReverse3() {
		Testing test = new Testing();
		assertEquals("A", test.reverse("A"));
	}
}