import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class StringsTests {

	
	
	@Test // input: 32 F -> expected output: 0
	void test1() {
		int expected = 0;
		int actual = Strings.convertTemp(32, "F");
		assertEquals(expected, actual);
	}
	
	@Test // input: 68 F -> expected output: 20
	void test2() {
		int expected = 20;
		int actual = Strings.convertTemp(68, "F");
		assertEquals(expected, actual);
	}
	
	@Test // input: 100 C -> expected output: 212
	void test3() {
		assertEquals(212, Strings.convertTemp(100, "C"));
	}
	
	@Test // input: -40 C -> expected output: -40
	void test4() {
		assertEquals(-40, Strings.convertTemp(-40, "C"));
	}	
	
	
	
	
	@Test
	void testEventTypeCasual() {
		String expected = "something comfy and a jacket";
		String actual = Strings.pickOutfit("casual", 68);
		assertEquals(expected, actual);
	}
	
	@Test
	void testEventTypeSemiFormal() {
		String expected = "a polo and a jacket";
		String actual = Strings.pickOutfit("semi-formal", 68);
		assertEquals(expected, actual);
	}
	
	@Test
	void testEventTypeFormal() {
		String expected = "a suit and a jacket";
		String actual = Strings.pickOutfit("formal", 68);
		assertEquals(expected, actual);
	}
	
	@Test
	void testTemperatureCold1() {
		assertEquals("a suit and a coat", Strings.pickOutfit("formal", 53));
	}
	@Test
	void testTemperatureMedium1() {
		assertEquals("a suit and a jacket", Strings.pickOutfit("formal", 54));
	}
	@Test
	void testTemperatureMedium2() {
		assertEquals("a polo and a jacket", Strings.pickOutfit("semi-formal", 70));
	}
	@Test
	void testTemperatureHot() {
		assertEquals("a polo and no jacket", Strings.pickOutfit("semi-formal", 71));
	}
	
	
}
