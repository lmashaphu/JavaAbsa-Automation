/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lethabo
 */
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Task2 {
    
    public static void main(String [] args) throws InterruptedException {
        
    WebDriver driver = new ChromeDriver(); // creating instance of the class which is Chrome
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        
        
        
    driver.manage().window().maximize(); // Maximazing the the driver
    
    driver.get("http://www.way2automation.com/angularjs-protractor/webtables/"); // Navigating to the url
        
    //Thread.sleep(20000);
    driver.findElement(By.xpath("//button[@class='btn btn-link pull-right']")).click();
    
    //Thread.sleep(20000);
    driver.findElement(By.xpath("//input[@name='FirstName']")).sendKeys("FName1");
    
    driver.findElement(By.xpath("//input[@name='LastName']")).sendKeys("LName1");
    
    driver.findElement(By.xpath("//input[@name='UserName']")).sendKeys("User1");
    
    driver.findElement(By.xpath("//input[@name='Password']")).sendKeys("Pass1");
    
    driver.findElement(By.xpath("//input[@value='15']")).click();
    
    driver.findElement(By.xpath("//select[@name='RoleId']")).sendKeys("Admin");
     
    driver.findElement(By.xpath("//input[@name='Email']")).sendKeys("admin@mail.com");
    
    driver.findElement(By.xpath("//input[@name='Mobilephone']")).sendKeys("082555");
    
    Thread.sleep(10000);

    driver.findElement(By.xpath("//button[@class='btn btn-success']")).click();
    
    driver.findElement(By.xpath("//button[@class='btn btn-link pull-right']")).click();
    
    //Entering second user
    driver.findElement(By.xpath("//input[@name='FirstName']")).sendKeys("FName2");
    
    driver.findElement(By.xpath("//input[@name='LastName']")).sendKeys("LName2");
    
    driver.findElement(By.xpath("//input[@name='UserName']")).sendKeys("User2");
    
    driver.findElement(By.xpath("//input[@name='Password']")).sendKeys("Pass2");
    
    driver.findElement(By.xpath("//input[@value='15']")).click();
    
    driver.findElement(By.xpath("//select[@name='RoleId']")).sendKeys("Customer");
     
    driver.findElement(By.xpath("//input[@name='Email']")).sendKeys("customer@mail.com");
    
    driver.findElement(By.xpath("//input[@name='Mobilephone']")).sendKeys("083444");
    
    Thread.sleep(10000);
    driver.findElement(By.xpath("//button[@class='btn btn-success']")).click();
     
    driver.quit();
    }
}