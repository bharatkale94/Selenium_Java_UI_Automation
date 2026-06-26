package testCases;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertionPractice {
	
	@Test
	public void softAssertExample()
	{
	
	SoftAssert softAssert = new SoftAssert();
	
	System.out.println("Test 1");

	softAssert.assertEquals("Google", "Facebook");
	
	System.out.println("Test 2");
	
	softAssert.assertAll(); // This is important to fail assert
	}
	
	
	@Test
    public void softAssertionTest() {

        SoftAssert softAssert = new SoftAssert();

        System.out.println("Step 1");

        softAssert.assertEquals("Instagram","Facebook");

        System.out.println("Step 2");

        softAssert.assertTrue(10 > 5);

        System.out.println("Step 3");

        softAssert.assertAll();
    }
}
