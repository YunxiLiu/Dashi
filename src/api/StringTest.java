package api;

import static org.junit.Assert.*;
import org.junit.Test;

public class StringTest {
	@Test
	public void testSubString() {
		String str = new String("This is a unit test.");
		assertEquals("unit", str.substring(10, 14));
	}
}
