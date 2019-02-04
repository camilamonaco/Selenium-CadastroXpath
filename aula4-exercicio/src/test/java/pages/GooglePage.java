package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GooglePage {
	
	static WebDriver driver;

	public GooglePage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void preencherXpath() {
		
		WebElement nome = driver.findElement(By.xpath("//*[@id=\"firstName\"]"));
		nome.sendKeys("Camila");
		
		WebElement sobrenome = driver.findElement(By.xpath("//*[@id=\"lastName\"]"));
		sobrenome.sendKeys("Monaco");
		
		WebElement email = driver.findElement(By.xpath("//*[@id=\"username\"]"));
		email.sendKeys("monacocamila1");
		
		WebElement senha = driver.findElement(By.xpath("//*[@id=\"passwd\"]/div[1]/div/div[1]/input"));
		senha.sendKeys("Teste@1234");
		
		WebElement confirmarSenha = driver.findElement(By.xpath("//*[@id=\"confirm-passwd\"]/div[1]/div/div[1]/input"));
		confirmarSenha.sendKeys("Teste@1234");
		
	}
	

}
