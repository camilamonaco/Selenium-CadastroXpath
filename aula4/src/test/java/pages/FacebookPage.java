package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FacebookPage {
	
	static WebDriver driver;

	public FacebookPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void preencherXpath() {
		
		WebElement nome = driver.findElement(By.xpath("//*[@id=\"u_0_j\"]"));
		nome.sendKeys("Camila");
		
		WebElement sobrenome = driver.findElement(By.xpath("//*[@id=\"u_0_l\"]"));
		sobrenome.sendKeys("Monaco");
		
		WebElement celular = driver.findElement(By.xpath("//*[@id=\"u_0_o\"]"));
		celular.sendKeys("11 987651234");
		
		WebElement senha = driver.findElement(By.xpath("//*[@id=\"u_0_v\"]"));
		senha.sendKeys("Teste@1234");
	}
	

}
