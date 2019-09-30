package com.project.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SingInPage extends Base {

	/*By registerLinkLocator = By.linkText("REGISTER");
	By imgLocator = By.xpath("//img[@src='/images/masts/mast_register.gif']");
	By userName = By.id("email");
	By password = By.name("password");
	By confirmPassword = By.name("confirmPassword");
	By btnSubmit = By.name("register");*/
	By txtBoxUserName = By.name("userName");
	By txtBoxPassword = By.name("password");
	By btnSingIn = By.name("login");
	By homePageLocator = By.xpath("//img[@src='/images/masts/mast_flightfinder.gif']");
	
	
	public SingInPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public void singIn() {
		
		if(isDisplayed(txtBoxUserName)) {
			sendKeys("Fulanito", txtBoxUserName);
			sendKeys("1234", txtBoxPassword);
			click(btnSingIn);
		}else {
			System.out.println("ERROR: La página no ha cargado aún!!");
		}
		
	}
	
	public boolean isHomePageDisplayed() {
		
		return isDisplayed(homePageLocator);
		
	}
	
}
