package com.project.pom;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {

	private WebDriver driver;
	
	/**
	 * Constructor
	 * 
	 * @param driver
	 */
	public Base(WebDriver driver) {
		
		this.driver = driver;
		
	}
	
	/**
	 * Metodo que devuelve una instancia WebDriver de tipo ChromeDriver()
	 * 
	 * @return driver
	 */
	public WebDriver chromeDriverConnection() {
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		driver = new ChromeDriver();
		return driver;
		
	}
	
	/**
	 * Envoltorio: este metodo devuelve un WebElement segun su localizador
	 * 
	 * @param locator
	 * @return 
	 */
	public WebElement findElement(By locator) {
		
		return driver.findElement(locator);
		
	}
	
	/**
	 * Envoltorio: este metodo devuelve un listado de WebElement segun su localizador
	 * 
	 * @param locator
	 * @return
	 */
	public List<WebElement> findElements(By locator){
		
		return driver.findElements(locator);
		
	}
	
	/**
	 * Envoltorio: este metodo devuelve el texto del WebElement que estamos pasando como parametro
	 * 
	 * @param element
	 * @return
	 */
	public String getText(WebElement element) {
		
		return element.getText();
		
	}
	
	/**
	 * Envoltorio: este metodo devuelve el texto del WebElement segun su localizador
	 * 
	 * @param locator
	 * @return
	 */
	public String getText(By locator) {
		
		return driver.findElement(locator).getText();
		
	}
	
	/**
	 * Envoltorio: metodo que envia texto, necesita el texto String y un localizador
	 * 
	 * @param texto
	 * @param locator
	 */
	public void sendKeys(String texto, By locator) {
		
		driver.findElement(locator).sendKeys(texto);
		
	}
	
	/**
	 * Envoltorio: metodo que hace click en un elemento, segun su localizador
	 * 
	 * @param locator
	 */
	public void click(By locator) {
		
		driver.findElement(locator).click();
		
	}
	
	/**
	 * Envoltorio: metodo que verifica si está en pantalla el elemento segun su localizador
	 * 
	 * @param locator
	 * @return
	 */
	public Boolean isDisplayed(By locator) {
		
		try {			
			return driver.findElement(locator).isDisplayed();			
		}catch(org.openqa.selenium.NoSuchElementException e) {			
			return false;	
		}
		
	}
	
	/**
	 * Envoltorio: metodo que ingresa a la página web segun la url que se pasa por parametros
	 * 
	 * @param url
	 */
	public void visit(String url) {	
		
		driver.get(url);	
		
	}

	/**
	 * HAY QUE AGREGAR MÁS FUNCIONES WN!!!
	 */
}
