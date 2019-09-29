package com.testing.selenium.testing.selenium;

import static org.junit.Assert.*;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MercuryTours_Test {

	//Instanciamos el Logger
	Logger logger = LogManager.getLogger(MercuryTours_Test.class);
	
	//Instanciamos el WebDriver
	private WebDriver driver;
	
	//Localizadores
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
	
	@Before
	public void setUp() throws Exception {
		
		logger.info("setUp");
		
		logger.info("Seteando las propiedades para ubicar el chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		
		logger.info("driver tipo ChromeDriver()");
		driver = new ChromeDriver();
		
		logger.info("Maximizando ventana");
		driver.manage().window().maximize();
		
		logger.info("Ingresando a página");
		driver.get("http://newtours.demoaut.com/mercurywelcome.php");
		
	}

	@After
	public void tearDown() throws Exception {
		
		logger.info("tearDown");
		
		logger.info("Cerrando el navegador");
//		driver.quit();
		
	}

	@Test
	public void registerUser() throws InterruptedException {
		
		logger.info("Test - registroUsuarioTest");
		
		logger.info("Click en REGISTER");
		driver.findElement(registerLinkLocator).click();//El localizador ya está declarado al inicio de la clase
		
		logger.info("Thread.sleep 5seg | Mala práctica");
		Thread.sleep(5000); 
		
		logger.info("Si la imagen existe");
		if(driver.findElement(imgLocator).isDisplayed()) {
			
			logger.info("Ingresado Nombre Usuario");
			driver.findElement(userName).sendKeys("Fulanito");
			
			logger.info("Ingresado el Passoword");
			driver.findElement(password).sendKeys("1234");
			
			logger.info("Ingresando el confirmador de passoword");
			driver.findElement(confirmPassword).sendKeys("1234");
			
			logger.info("Click en Submit");
			driver.findElement(btnSubmit).click();
			
		}else{
			
			logger.info("ERROR: La página no ha cargado aún!!");
			System.out.println("ERROR: La página no ha cargado aún!!");
			
		}
		
		logger.info("Crando un Listado (List<>) de WebElement de tipo 'font'");
		List<WebElement> fonts = driver.findElements(By.tagName("font"));
		
		logger.info("Validamos que dentro del listado existe un WebElement que su texto coincida");
		assertEquals("Note: Your user name is Fulanito.", fonts.get(5).getText());
		
	}
	
	@Test
	public void signIn() throws InterruptedException {
		
//		Thread.sleep(15000);
		
		logger.info("Test - signIn");
		
		logger.info("Si el campo de texto para el nombre de usuario existe");
		if(driver.findElement(txtBoxUserName).isDisplayed()) {
			
			logger.info("Ingresado el nombre de usuario");
			driver.findElement(userName).sendKeys("Fulanito");
			
			logger.info("Ingresada la contraseña");
			driver.findElement(txtBoxPassword).sendKeys("1234");
			
			logger.info("Presionado el botón Sing In");
			driver.findElement(btnSingIn).click();
			
			logger.info("Thread.sleep 5seg | Mala práctica");
			Thread.sleep(5000);
			
			logger.info("Validamos que estamos dentro de la página de inicio de usuario registrado");
			assertTrue(driver.findElement(homePageLocator).isDisplayed());
			
		}else {
			logger.info("ERROR: La página no ha cargado aún");
			System.out.println("ERROR: La página no ha cargado aún");
		}
		
	}

}
