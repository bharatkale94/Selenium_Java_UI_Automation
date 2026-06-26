package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertionPractice {

	@Test
	public void assertEqualsPassExample()
	{
		String expected="Google";
		
		String Actual="Google";
		
		Assert.assertEquals(Actual, expected);
		
		System.out.println("Assertion Passed");
		
		
	}
	
	@Test
	public void assertEqualsFailExample()
	{
		String expected="Google";
		
		String Actual="Facebook";
		
		System.out.println("Verify Assertion pass or failed"); // This line will print
		 
		Assert.assertEquals(Actual, expected);
		
		System.out.println("Assertion Failed"); // This line will not print
		
	}
	
	@Test
	public void assertTrueExample() {

	    Assert.assertTrue(10 > 5);

	    System.out.println("Condition is True");
	}
	
	@Test
	public void assertFalseExample() {

	    Assert.assertFalse(10 < 5);

	    System.out.println("Condition is False");
	}
}
