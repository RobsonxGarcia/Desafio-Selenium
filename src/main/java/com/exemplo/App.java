package com.exemplo;

import java.util.List;
import java.util.Timer;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class App 
{
    public static void main( String[] args )
    {
    	System.setProperty("webdriver.chrome.driver", "C:/geckodriver/chromedriver.exe");
    	ChromeOptions options = new ChromeOptions();
    	options.addArguments("--host-resolver-rules=MAP localhost 8080");
    	WebDriver driver = new ChromeDriver();
    	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://demo.automationtesting.in/Register.html");
        try {
        driver.findElement(By.xpath("//*[@id='basicBootstrapForm']/div[1]/div[1]/input")).sendKeys("Robson");
        driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[2]/input")).sendKeys("Garcia");
        driver.findElement(By.xpath("//*[@id=\'basicBootstrapForm\']/div[2]/div/textarea")).sendKeys("Avenida: São Bento, 634 - Guarulhos: SP Cep 07070-000");  
        driver.findElement(By.xpath("//*[@id=\"eid\"]/input")).sendKeys("robsonxgarcia@gmail.com");
        driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[4]/div/input")).sendKeys("11-96776-7565");
        driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[5]/div/label[1]/input")).click();
        driver.findElement(By.xpath("//*[@id=\"checkbox2\"]")).click();
        driver.findElement(By.id("msdd")).click();
        driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[7]/div/multi-select/div[2]/ul/li[29]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[7]/div/multi-select/div[2]/ul/li[8]/a")).click();
        driver.findElement(By.xpath("/html/body/section/div/div/div[2]/form/div[10]/div/span/span[1]/span/span[2]/b")).click();
        driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys("United States Of America");
        driver.findElement(By.id("yearbox")).click();  
        driver.findElement(By.xpath("//*[@id=\"yearbox\"]/option[57]")).click();
        driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[11]/div[2]/select")).click();  
        driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[11]/div[2]/select/option[3]")).click();
        driver.findElement(By.id("daybox")).click();  
        driver.findElement(By.xpath("//*[@id=\"daybox\"]/option[8]")).click();
        driver.findElement(By.xpath("//*[@id=\"firstpassword\"]")).sendKeys("robs@2023");
        driver.findElement(By.xpath("//*[@id=\"secondpassword\"]")).sendKeys("robs@2023");
        WebElement elementList = driver.findElement(By.xpath("//*[@id=\"Skills\"]"));
        Select select = new Select(elementList);
        select.selectByValue("Java"); 
        driver.findElement(By.xpath("//*[@id=\"submitbtn\"]")).click();
        } finally {
        try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        driver.get("https://demo.automationtesting.in/Frames.html");
        driver.switchTo().frame(1);
        driver.findElement(By.xpath("/html/body/section/div/div/div/input")).sendKeys("Frame0");
        try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        driver.get("https://demo.automationtesting.in/Datepicker.html");
        driver.findElement(By.id("datepicker2")).sendKeys("07/02/1971");
        try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        driver.get("https://demo.automationtesting.in/Slider.html");
        WebElement slider = driver.findElement(By.xpath("//*[@id=\"slider\"]/a"));
        Actions actions = new Actions(driver);
        actions.clickAndHold(slider).moveByOffset(600, 0).release().perform();
        }
        
    }
}
