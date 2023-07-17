package com.anhtester.Bai6_WebElement;

import com.anhtester.Bai5_Locators.BT_LocatorsCRM;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Demo6ActionsGet {
    public static void main(String[] args) throws InterruptedException {
        //Khởi tạo browser
        WebDriver driver;
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));

        driver.get("https://crm.anhtester.com/admin/authentication");

        String headerPage = driver.findElement(By.xpath(BT_LocatorsCRM.headerLoginPage)).getText();
        System.out.println("Header Login Page: " + headerPage);

        String buttonLoginBGColor = driver.findElement(By.xpath(BT_LocatorsCRM.buttonLogin)).getCssValue("background-color");
        System.out.println("Background Color: " + buttonLoginBGColor);
        System.out.println("Text Color: " + driver.findElement(By.xpath(BT_LocatorsCRM.buttonLogin)).getCssValue("color"));

        Dimension dimensions = driver.findElement(By.xpath(BT_LocatorsCRM.buttonLogin)).getSize();
        System.out.println("Height: " + dimensions.getHeight());
        System.out.println("Width: " + dimensions.getWidth());

        Point point = driver.findElement(By.xpath(BT_LocatorsCRM.buttonLogin)).getLocation();
        System.out.println("X: " + point.getX());
        System.out.println("Y: " + point.getY());

        String buttonLoginAttribute = driver.findElement(By.xpath(BT_LocatorsCRM.buttonLogin)).getAttribute("type");
        System.out.println("Type value: " + buttonLoginAttribute);
        System.out.println("Class value: " + driver.findElement(By.xpath(BT_LocatorsCRM.buttonLogin)).getAttribute("class"));

        driver.findElement(By.xpath(BT_LocatorsCRM.inputEmail)).sendKeys("admin@example.com");
        Thread.sleep(500);
        driver.findElement(By.xpath(BT_LocatorsCRM.inputPassword)).sendKeys("123456");
        Thread.sleep(100);
        System.out.println("Email value: " + driver.findElement(By.xpath(BT_LocatorsCRM.inputEmail)).getAttribute("value"));
        System.out.println("Password value: " + driver.findElement(By.xpath(BT_LocatorsCRM.inputPassword)).getAttribute("value"));

        driver.get("https://anhtester.com/login");
        Thread.sleep(1000);
        System.out.println("Van ban goi y: " + driver.findElement(By.xpath("//input[@name='email']")).getAttribute("placeholder"));

        Thread.sleep(1000);
        driver.quit();
    }
}
