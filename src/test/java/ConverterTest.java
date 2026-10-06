import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class ConverterTest
{
	private static final double ACCURACY = 0.05;

	private static Converter converter;

	//do it before doing the testing
	@BeforeAll
	public static void setup()
	{
		// This method only setups the unit testing.
		// In other words, this method is responsible for instantiating or initializing 
		// any variables that unit test methods need.
		converter = new Converter();		
	}

	@Test
	public void test_mph2kph()
	{
		// Test convert mph to kph -- comparing doubles using assertEquals
		assertEquals(38.6243, converter.mph2kph(24), ACCURACY, "mph2kmh failed:");
		assertEquals(96.5606, converter.mph2kph(60), ACCURACY, "mph2kmh failed:");
	}
	
	@Test
	public void test_mph2kmh_printing()
	{
		// Test convert_array -- comparing Strings using assertEquals
		assertEquals("60.0 mph = 96.5 kph", converter.mph2kph_printing(60),"mph2kmh_printing failed:");
	}

	@Test
	public void test_mph2kph_compare()
	{
		// 60 mph is faster than 24 mph, so this should be false
		assertFalse(converter.mph2kph_compare(24, 60));
	}
}
