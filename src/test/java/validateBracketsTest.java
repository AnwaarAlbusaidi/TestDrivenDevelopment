import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class validateBracketsTest {
	
	@Test
	@DisplayName("Take null as an arguments.")
	void testOpenCloseValidate() throws Exception {
		validateBrackets test = new validateBrackets();
		assertEquals(false, test.openCloseValidate(null));
	}
	@Test
	@DisplayName("Take an empty string as an argument.")
	void testOpenCloseValidate1() throws Exception {
		validateBrackets test = new validateBrackets();
		assertEquals(true, test.openCloseValidate(""));
	}
	@Test
	@DisplayName("Can throw an exception.")
	void testOpenCloseValidate2() throws Exception {
		validateBrackets test = new validateBrackets();
		assertThrows(Exception.class,() -> test.openCloseValidate(null));
	}
}