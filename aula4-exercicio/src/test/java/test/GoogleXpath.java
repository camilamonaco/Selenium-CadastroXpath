package test;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.GooglePage;

public class GoogleXpath {

	static WebDriver driver;
	static GooglePage googlePage;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://accounts.google.com/signup/v2/webcreateaccount?flowName=GlifWebSignIn&flowEntry=SignUp");
		googlePage = new GooglePage(driver);
	}
	
	@Test
	public void test() {
		googlePage.preencherXpath();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		driver.close();
	}


}
