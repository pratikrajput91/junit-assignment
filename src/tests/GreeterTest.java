package tests;

import mains.Greeter;
import org.junit.Test;
import static org.junit.Assert.*;

public class GreeterTest
{
	@Test
	public void testgreet()
	{
		assertEquals("Hello",new Greeter().greet());
	}
}