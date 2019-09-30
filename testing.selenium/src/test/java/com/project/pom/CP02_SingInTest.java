package com.project.pom;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class CP02_SingInTest {

	private WebDriver driver;
	SingInPage singInPage;
	
	@Before
	public void setUp() throws Exception {
		
		singInPage = new SingInPage(driver);
		driver = singInPage.chromeDriverConnection();
		singInPage.visit("http://newtours.demoaut.com/mercurywelcome.php");
		
	}

	@After
	public void tearDown() throws Exception {
		
//		driver.quit();
		
	}

	@Test
	public void test() throws InterruptedException {

		singInPage.singIn();
		Thread.sleep(5000);
		
		assertTrue(singInPage.isHomePageDisplayed());
		
	}

}
