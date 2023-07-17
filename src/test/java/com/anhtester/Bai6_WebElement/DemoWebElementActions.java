package com.anhtester.Bai6_WebElement;

import com.anhtester.Bai5_Locators.BT_LocatorsCRM;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class DemoWebElementActions {

    public static void main(String[] args) throws InterruptedException {

        //Khởi tạo browser
        WebDriver driver;
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://crm.anhtester.com/admin/authentication");

        //sendKeys, Click, Clear
        driver.findElement(By.xpath(BT_LocatorsCRM.inputEmail)).clear();
        driver.findElement(By.xpath(BT_LocatorsCRM.inputPassword)).clear();

        driver.findElement(By.xpath(BT_LocatorsCRM.inputEmail)).sendKeys("admin@example.com");
        Thread.sleep(500);
        driver.findElement(By.xpath(BT_LocatorsCRM.inputPassword)).sendKeys("123456");
        Thread.sleep(500);
        //driver.findElement(By.xpath(BT_LocatorsCRM.buttonLogin)).click();
        driver.findElement(By.xpath(BT_LocatorsCRM.inputPassword)).submit();

        Thread.sleep(2000);
        driver.quit();
    }

}
