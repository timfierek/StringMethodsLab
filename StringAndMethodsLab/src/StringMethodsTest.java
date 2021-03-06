import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StringMethodsTest {

	@Test
	void testCapitalize() {
		String expected = "Java";
		String actual = StringMethods.capitalize("java");
		assertEquals(expected, actual);
	}
	
	@Test
	void testWheresWaldo() {
		String expected = "14";
		String actual = StringMethods.wheresWaldo("idontknowwhereWALDOis");
		assertEquals(expected, actual);
	}
	
	@Test
	void testFirstThingsFirst() {
		String expected = "boot Camp";
		String actual = StringMethods.firstThingsFirst("Camp", "boot");
		assertEquals(expected, actual);
	}
	
	@Test
	void testReverse() {
		String expected = "backwards";
		String actual = StringMethods.reverse("sdrawkcab");
		assertEquals(expected, actual);
	}
	
	@Test
	void testSoLong() {
		String expected = "toast";
		String actual = StringMethods.soLong("toast", "eggs");
		assertEquals(expected, actual);
	}
	
	@Test
	void testAfterMath() {
		String expected = "math bruh";
		String actual = StringMethods.afterMath("nobody likes math bruh");
		assertEquals(expected, actual);
	}
	
	@Test
	void testLetterize() {
		String expected = "c o f f e e ";
		String actual = StringMethods.letterize("coffee");
		assertEquals(expected, actual);
	}

}
