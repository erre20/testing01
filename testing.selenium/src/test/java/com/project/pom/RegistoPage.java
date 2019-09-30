package com.project.pom;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegistoPage extends Base {

	//Localizadores
	/**
	 * Estos localizadores, en el futuro van a ir en una clase donde serán Constantes
	 * Serán ConstantesGenerales
	 */
	By registerLinkLocator = By.linkText("REGISTER");
	By imgLocator = By.xpath("//img[@src='/images/masts/mast_register.gif']");
	By userName = By.id("email");
	By password = By.name("password");
	By confirmPassword = By.name("confirmPassword");
	By btnSubmit = By.name("register");
	By txtBoxUserName = By.name("userName");
	By txtBoxPassword = By.name("password");
	By btnSingIn = By.name("login");
	By homePageLocator = By.xpath("//img[@src='/images/masts/mast_flightfinder.gif']");

	By registeredMessage = By.tagName("font");
	
	/**
	 * Constructor de la clase 'padre'
	 * @param driver
	 */
	public RegistoPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	
	public void regitroUsuario() throws InterruptedException {
		
		click(registerLinkLocator);
		Thread.sleep(3000);
		
		if(isDisplayed(imgLocator)) {
			sendKeys("Fulanito", userName);
			sendKeys("1234", password);
			sendKeys("1234", confirmPassword);
			
			click(btnSubmit);
		}else {
			System.out.println("La página de registro no fué encontrada");
		}
	}
	
	public String mensajeRegistro() {
		
		List<WebElement> fonts = findElements(registeredMessage);		
		return getText(fonts.get(5));
		
	}
	
	
}
