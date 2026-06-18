package testCases;

import org.testng.annotations.Test;

import utilities.ConfigReader;

public class ConfigReaderTest {

	@Test
	public void verifyConfig() {

		System.out.println(ConfigReader.getProperty("url"));

		System.out.println(ConfigReader.getProperty("browser"));
	}
}
