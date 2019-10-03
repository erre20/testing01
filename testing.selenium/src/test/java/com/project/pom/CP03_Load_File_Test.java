package com.project.pom;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;

public class CP03_Load_File_Test {
	
	private WebDriver driver;
	RegistoPage registroPage;	
	
	@Before
	public void setUp() throws Exception {
		registroPage = new RegistoPage(driver);
		driver = registroPage.chromeDriverConnection();
		registroPage.visit("https://tus.io/demo.html");	
	}

	@After
	public void tearDown() throws Exception {
		
		
		
	}

	@Test
	public void test() {
		
		driver.findElement(By.xpath("//input[@type='file']")).sendKeys("C:\\Users\\Casa\\Desktop\\demo.json");
		driver.findElement(By.xpath("//button[@id='toggle-btn']")).click();
		driver.findElement(By.xpath("//button[@id='toggle-btn']")).click();
		
		
		
	}

}
