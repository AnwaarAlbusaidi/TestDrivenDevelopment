import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class splitTest {

	@Test
	@DisplayName("Take null for both of the arguments.")
	void testSpilt() {
		split test = new split();
		ArrayList<String> spiltArrayList = new ArrayList<String>();
		assertArrayEquals(spiltArrayList.toArray(), test.spilt(null,null).toArray());
	}
	@Test
	@DisplayName("Take an empty string as the first argument.")
	void testSpilt1() {
		split test = new split();
		ArrayList<String> spiltArrayList = new ArrayList<String>();
		assertEquals(spiltArrayList, test.spilt("",' '));
	}
	@Test
	@DisplayName("Take an empty string as the second argument.")
	void testSpilt2() {
		split test = new split();
		ArrayList<String> spiltArrayList = new ArrayList<String>();
		spiltArrayList.add("Anwaar ");
		spiltArrayList.add("Mohammed");
		assertEquals(spiltArrayList, test.spilt("Anwaar Mohammed",' '));
	}
	@Test
	@DisplayName("Return an empty array.")
	void testSpilt3() {
		split test = new split();
		ArrayList<String> spiltArrayList = new ArrayList<String>();
		assertEquals(spiltArrayList, test.spilt("",null));

	}
}
