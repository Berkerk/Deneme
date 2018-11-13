package OtomasyonFramework;

import static org.junit.Assert.*;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.firefox.FirefoxDriver;

import org.junit.Test;

import org.openqa.selenium.chrome.ChromeDriver;

public class JUnitTest {

	@Test
	public void test() {
		WebDriver browser;
		browser = new FirefoxDriver(); 
		browser.get("http://saucelabs.com");
	}

}
