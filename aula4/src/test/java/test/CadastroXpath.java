package test;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.FacebookPage;

public class CadastroXpath {

	static WebDriver driver;
	static FacebookPage facebookPage;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		facebookPage = new FacebookPage(driver);
	}

	@Test
	public void test() {
		facebookPage.preencherXpath();
	}
	
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		driver.close();
	}



}
