package com.testing.selenium.testing.selenium;

import static org.junit.Assert.*;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DataDrivenTesting_SWD_Test {

	Logger logger = LogManager.getLogger(DataDrivenTesting_SWD_Test.class);
	private WebDriver driver;
	private LeeArchivoExcel leerArchivoExcel;
	
	@Before
	public void setUp() throws Exception {
		
		logger.info("Iniciando metodo setUp");
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.cl/");
		
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
