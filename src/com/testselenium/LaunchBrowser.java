package com.testselenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class LaunchBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Launching Chrome
		System.setProperty("webdriver.chrome.driver","C:\\Users\\a631020\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://aktu.ac.in/"); 

	}

}
