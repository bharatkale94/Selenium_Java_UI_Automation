package testCases;

import org.testng.annotations.Test;

public class TestNGGroups {
	
	    @Test(groups = {"smoke", "regression"})
	    public void login() {
	        System.out.println("Login");
	    }

	    @Test(groups = "smoke")
	    public void searchFund() {
	        System.out.println("Search Fund");
	    }

	    @Test(groups = "smoke")
	    public void logout() {
	        System.out.println("Logout");
	    }

	    @Test(groups = "regression")
	    public void portfolioAnalysis() {
	        System.out.println("Portfolio Analysis");
	    }

	    @Test(groups = "regression")
	    public void performanceReport() {
	        System.out.println("Performance Report");

	    } 

}
