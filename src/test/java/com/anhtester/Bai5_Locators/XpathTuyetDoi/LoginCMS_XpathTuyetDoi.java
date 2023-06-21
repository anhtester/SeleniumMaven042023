package com.anhtester.Bai5_Locators.XpathTuyetDoi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class LoginCMS_XpathTuyetDoi {
    public static void main(String[] args) throws InterruptedException {

        //Khởi tạo Browser
        //ChromeDriver, EdgeDriver, FirefoxDriver
        //MacOS: SafariDriver
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //Open website
        driver.get("https://cms.anhtester.com/login");
        //admin@example.com/123456

        //Định vị các Element trên trang Login CMS
        //1. Ô Email
        //driver.findElement(By.id("email")).sendKeys("admin@example.com");

        //driver.findElement(By.id("email")).sendKeys("admin@example.com");
        driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/form/div[1]/input")).sendKeys("admin@example.com");
        
        //2. Ô Password
        //driver.findElement(By.name("password")).sendKeys("123456");
        driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/form/div[2]/input")).sendKeys("123456");

        //4. Link text Forgot Password
        //driver.findElement(By.linkText("Forgot password ?")).click();
        //driver.findElement(By.partialLinkText("password")).click();

        //3. Nút Login
        //driver.findElement(By.tagName("button")).click();
        driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/form/button")).click();

        Thread.sleep(3000); //Ngủ 3 giây

        //Tắt Browser
        driver.quit();

    }
}
