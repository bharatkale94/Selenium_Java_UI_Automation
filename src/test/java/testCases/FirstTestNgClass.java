package testCases;

import org.testng.annotations.Test;

public class FirstTestNgClass {
	
	@Test
	public void loginTest()
	{
		System.out.println("Login Test Executed");
	}

	@Test
    public void searchTest() {

        System.out.println("Search Test Executed");

    }

    @Test
    public void logoutTest() {

        System.out.println("Logout Test Executed");

    }
}
