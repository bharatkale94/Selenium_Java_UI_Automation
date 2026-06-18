package testCases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderPractice {

	@DataProvider(name = "userData")
	public Object[][] userData() {

		return new Object[][] {

				{ "Bharat" }, { "Rupali" }, { "Rahul" }, { "Snehal" }

		};
	}

	@Test(dataProvider = "userData")
	public void printUser(String name) {

		System.out.println(name);

	}

	@DataProvider(name = "studentData")
	public Object[][] studentData() {
		return new Object[][] { { "Bharat", 90 }, { "Rahul", 85 }, { "Snehal", 95 } };
	}

	@Test(dataProvider = "studentData")
	public void printStudentData(String name, int marks) {
		System.out.println(name);
		System.out.println(marks);
	}
}
