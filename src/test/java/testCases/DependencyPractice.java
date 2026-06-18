package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependencyPractice {
	
	 @Test
	    public void login() {

	        System.out.println("Login Successful");
	        //Assert.fail(); //intentionally failed Test

	    }

	    @Test(dependsOnMethods = "login")
	    public void searchFund() {

	        System.out.println("Searching Fund");

	    }

	    @Test(dependsOnMethods = "searchFund")
	    public void buyFund() {

	        System.out.println("Buying Fund");

	    }

	    @Test(dependsOnMethods = "buyFund")
	    public void logout() {

	        System.out.println("Logout");

	    }


}
