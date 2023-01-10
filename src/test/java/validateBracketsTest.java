import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class validateBracketsTest {
	
	@Test
	@DisplayName("Take null as an arguments.")
	void testOpenCloseValidate() {
		validateBrackets test = new validateBrackets();
		assertThrows(NullPointerException.class, () -> {
			test.openCloseValidate(null);
		});
	}
	
	@Test
	@DisplayName("Take an empty string as an argument.")
	void testOpenCloseValidate1() {
		validateBrackets test = new validateBrackets();
		assertEquals(true, test.openCloseValidate(""));
	}
	
	@Test
	@DisplayName("Can throw an exception.")
	void testOpenCloseValidate2() {
		validateBrackets test = new validateBrackets();
	}
	
	
}
