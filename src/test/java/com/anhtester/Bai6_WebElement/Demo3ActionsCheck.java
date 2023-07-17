package com.anhtester.Bai6_WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Demo3ActionsCheck {

    public static void main(String[] args) throws InterruptedException {
        //Khởi tạo browser
        WebDriver driver;
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://anhtester.com/");

        WebElement tagH1 = driver.findElement(By.xpath("//h1[normalize-space()='Anh Tester Automation Testing']"));
        WebElement tagH2 = driver.findElement(By.xpath("//div[@class='col-lg-7']//h2[@class='section__title'][contains(text(),'Anh Tester')]"));

        boolean checkDisplay1 = tagH1.isDisplayed(); //Trả về True/False
        boolean checkDisplay2 = tagH2.isDisplayed();

        //System.out.println(checkDisplay1);

        if(checkDisplay1 == false && checkDisplay2 == false){
            System.out.println("True");
        }else {
            System.out.println("False");
        }

        Thread.sleep(2000);

        driver.get("https://angular-reactive-forms-zvzqvd.stackblitz.io/");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//span[normalize-space()='Run this project']")).click();
        Thread.sleep(2000);
        WebElement buttonSubmit = driver.findElement(By.xpath("//button[normalize-space()='Submit']"));

        buttonSubmit.isEnabled(); //Trả về True/False

        if(buttonSubmit.isEnabled() == false){
            System.out.println("True");
        }else {
            System.out.println("False");
        }

        driver.get("https://crm.anhtester.com/admin/authentication");
        Thread.sleep(2000);
        WebElement checkboxRemember = driver.findElement(By.xpath("//input[@id='remember']"));
        if(checkboxRemember.isSelected() == false){
            System.out.println("isSelected(): True");
        }else {
            System.out.println("isSelected(): False");
        }
        driver.findElement(By.xpath("//label[normalize-space()='Remember me']")).click();
        Thread.sleep(2000);
        if(checkboxRemember.isSelected() == false){
            System.out.println("isSelected(): True");
        }else {
            System.out.println("isSelected(): False");
        }

        driver.quit();
    }

}
