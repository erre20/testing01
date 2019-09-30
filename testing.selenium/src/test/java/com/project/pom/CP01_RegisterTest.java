package com.project.pom;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class CP01_RegisterTest {

	private WebDriver driver;
	RegistoPage registroPage;
	
	@Before
	public void setUp() throws Exception {
		registroPage = new RegistoPage(driver);
		driver = registroPage.chromeDriverConnection();
		registroPage.visit("http://newtours.demoaut.com/mercurywelcome.php");	
	}

	@After
	public void tearDown() throws Exception {
		
//		driver.quit();
		
	}

	@Test
	public void test() throws InterruptedException {
		
		registroPage.regitroUsuario();
		assertEquals("Note: Your user name is Fulanito.", registroPage.mensajeRegistro());
		
	}

}
