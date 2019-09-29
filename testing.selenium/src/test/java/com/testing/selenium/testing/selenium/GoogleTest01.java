package com.testing.selenium.testing.selenium;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Clase para hacer un test muy básico inicial con JUnit y Selenium + ChromeDriver
 * 
 * @author Casa
 *
 */
public class GoogleTest01 {

	//Instanciando Logger
	Logger logger = LogManager.getLogger(GoogleTest01.class);
	
	//Creando un objeto WebDriver
	private WebDriver driver;
	
	@Before
	public void setUp() {
		
		logger.info("Iniciando metodo setUp");
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.cl/");
	}
	
	@Test
	public void googleTest() {
		
		WebElement campoBusqueda = driver.findElement(By.name("q"));
		campoBusqueda.clear();
		campoBusqueda.sendKeys("Selenium");
		campoBusqueda.submit();//Así evitamos crear un WebElement del botón de busqueda
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		assertEquals("Selenium - Buscar con Google", driver.getTitle());
		
	}
	
	@After
	public void tearDown() {
		
		driver.quit();
		
	}
	
	
	
}
