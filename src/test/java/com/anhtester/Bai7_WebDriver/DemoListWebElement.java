package com.anhtester.Bai7_WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;
import java.util.List;

public class DemoListWebElement {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));

        // Navigate to a page
        driver.get("https://www.google.com/");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//textarea[@name='q']")).click();
        driver.findElement(By.xpath("//textarea[@name='q']")).sendKeys("Selenium Java");
        driver.findElement(By.xpath("//textarea[@name='q']")).sendKeys(Keys.ENTER);
        Thread.sleep(1000);

        List<WebElement> listTitle = driver.findElements(By.xpath("//h3"));

        for (int i = 0; i < listTitle.size(); i++) {
            System.out.println(listTitle.get(i).getText());
            //Compare

        }

        Thread.sleep(1000);
        driver.quit();
    }
}
