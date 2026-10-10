import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class ConverterTest
{
	// means "close enough counts". The test passes if the two numbers are within 0.05 of each other.
	private static final double ACCURACY = 0.05;

	private static Converter converter;

	//do it before doing the testing
	@BeforeAll
	public static void setup()
	{
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

		// 24 mph is faster than 60 mph, so this should be false
		assertTrue(converter.mph2kph_compare(60, 24));

		// 50 mph is equal to 50 mph, true;
		assertTrue(converter.mph2kph_compare(50,50));
	}

	@Test
	public void test_convert_array() {
		//the input we wil be passing in the method from converter
		double[] inputGiven = {24, 60};

		//the expected out we will use to compare if it actually converted the array to kph properly
		double[] expectedOutput = {38.6243, 96.5606};

		assertArrayEquals(expectedOutput, converter.convert_array("mph2kph", inputGiven), ACCURACY);
	}

	@Test
	public void test_convert_array_cel2fah() {
		double[] inputGiven = {0, 100};
		double[] expectedOutput = {32.0, 212.0};

		assertArrayEquals(expectedOutput, converter.convert_array("cel2fah", inputGiven), ACCURACY);
	}

	@Test
	public void test_convert_array_pounds2dollars() {
		double[] inputGiven = {10, 50};
		double[] expectedOutput = {13.2, 66.0};

		assertArrayEquals(expectedOutput, converter.convert_array("pounds2dollars", inputGiven), ACCURACY);
	}

	@Test
	public void test_convert_array_seconds2hours() {
		double[] inputGiven = {3600, 7200};
		double[] expectedOutput = {1.0, 2.0};

		assertArrayEquals(expectedOutput, converter.convert_array("seconds2hours", inputGiven), ACCURACY);
	}

}
