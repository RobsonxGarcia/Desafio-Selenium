package com.exemplo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class App 
{
    public static void main( String[] args )
    {
    	System.setProperty("webdriver.chrome.driver", "C:/geckodriver/chromedriver.exe");
    	ChromeOptions options = new ChromeOptions();
    	options.addArguments("--host-resolver-rules=MAP localhost 8080");
    	WebDriver driver = new ChromeDriver();
        driver.get("https://demo.automationtesting.in/Register.html");
           }
}
