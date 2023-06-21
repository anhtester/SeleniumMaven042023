package com.anhtester.Bai5_Locators.XpathTuongDoi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class LoginCRM_XpathTuyetDoi {
    public static void main(String[] args) throws InterruptedException {

        //Khởi tạo Browser
        //ChromeDriver, EdgeDriver, FirefoxDriver
        //MacOS: SafariDriver
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //Open website
        driver.get("https://crm.anhtester.com/admin/authentication");
        //admin@example.com/123456

        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("admin@example.com");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");
        driver.findElement(By.xpath("//button[@class='btn btn-primary btn-block']")).click();

        Thread.sleep(3000);

        //Tắt Browser
        driver.quit();

    }
}
