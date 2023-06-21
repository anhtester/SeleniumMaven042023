package com.anhtester.Bai5_Locators.XpathTuongDoi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class AddCustomer {
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

        //Login CRM
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("admin@example.com");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");
        driver.findElement(By.xpath("//button[@type='submit']")).click();

        Thread.sleep(2000);
        //Add Customer
        driver.findElement(By.xpath("//span[normalize-space() = 'Customers']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[normalize-space() = 'New Customer']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='company']")).sendKeys("Anh Tester 21/06/2023 A2");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id='vat']")).sendKeys("10");
        Thread.sleep(1000);
        //driver.findElement(By.xpath("//button[contains(text(), 'create contact')]")).click();
        driver.findElement(By.xpath("//button[contains(normalize-space(), 'create contact')]")).click();

        Thread.sleep(3000);
        System.out.println("AddCustomer thành công !!");

        //Tắt Browser
        driver.quit();

    }
}
