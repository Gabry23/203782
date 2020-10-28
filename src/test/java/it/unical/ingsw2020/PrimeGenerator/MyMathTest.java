package it.unical.ingsw2020.PrimeGenerator;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.LinkedList;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MyMathTest {

	private static MyMath math;
		
	@BeforeClass
	public static void prepare() {
		math = new MyMath();
	}
	
	@Test
	public void primeNumbersGeneratorWorks() {
		assertEquals(new LinkedList<Integer>(), math.primeNumbersGenerator(1));
		assertEquals(Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19), math.primeNumbersGenerator(20));
	}
	
	@Test
	public void isPrimeWorks() {
		assertFalse(math.isPrime(9));
		assertFalse(math.isPrime(1));
		assertTrue(math.isPrime(2));
	}
}
