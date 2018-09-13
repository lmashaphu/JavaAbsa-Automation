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
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Task2 {
    
    public static void main(String [] args) throws InterruptedException {
        
    WebDriver driver = new ChromeDriver(); // creating instance of the class which is Chrome
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    WebDriverWait wait = new WebDriverWait(driver, 15);
        
        
        
    driver.manage().window().maximize(); // Maximazing the the driver
    
    driver.get("http://www.way2automation.com/angularjs-protractor/webtables/"); // Navigating to the url
        
    //Thread.sleep(20000);
    driver.findElement(By.xpath("//button[@class='btn btn-link pull-right']")).click();
    
    //Thread.sleep(20000);
    
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='FirstName']")));
    driver.findElement(By.xpath("//input[@name='FirstName']")).sendKeys("FName1");
    System.out.print("FirstName is Entered and textbox is visible");
    



    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='LastName']")));
    driver.findElement(By.xpath("//input[@name='LastName']")).sendKeys("LName1");
    
    
     wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='UserName']")));
    driver.findElement(By.xpath("//input[@name='UserName']")).sendKeys("User1");
    
     wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='Password']")));
    driver.findElement(By.xpath("//input[@name='Password']")).sendKeys("Pass1");
    
     wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@value='15']")));
    driver.findElement(By.xpath("//input[@value='15']")).click();
    
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@name='RoleId']")));
    driver.findElement(By.xpath("//select[@name='RoleId']")).sendKeys("Admin");
     
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='Email']")));
    driver.findElement(By.xpath("//input[@name='Email']")).sendKeys("admin@mail.com");
    
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='Mobilephone']")));
    driver.findElement(By.xpath("//input[@name='Mobilephone']")).sendKeys("082555");
    
    Thread.sleep(10000);

    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='btn btn-success']")));
    driver.findElement(By.xpath("//button[@class='btn btn-success']")).click();
    
     wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='btn btn-link pull-right']")));
    driver.findElement(By.xpath("//button[@class='btn btn-link pull-right']")).click();
    
    //Entering second user
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='FirstName']")));
    driver.findElement(By.xpath("//input[@name='FirstName']")).sendKeys("FName2");
    
      wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='LastName']")));
    driver.findElement(By.xpath("//input[@name='LastName']")).sendKeys("LName2");
    
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='UserName']")));
    driver.findElement(By.xpath("//input[@name='UserName']")).sendKeys("User2");
    
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='Password']")));
    driver.findElement(By.xpath("//input[@name='Password']")).sendKeys("Pass2");
    
     wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@value='15']")));
    driver.findElement(By.xpath("//input[@value='15']")).click();
    
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@name='RoleId']")));
    driver.findElement(By.xpath("//select[@name='RoleId']")).sendKeys("Customer");
     
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='Email']")));
    driver.findElement(By.xpath("//input[@name='Email']")).sendKeys("customer@mail.com");
    
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='Mobilephone']")));
    driver.findElement(By.xpath("//input[@name='Mobilephone']")).sendKeys("083444");
    
    Thread.sleep(10000);
     wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='btn btn-success']")));
    driver.findElement(By.xpath("//button[@class='btn btn-success']")).click();
     
    driver.quit();
    }
}
