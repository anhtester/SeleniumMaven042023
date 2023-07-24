package com.anhtester.Bai8_Checkbox_Radio_Dropdown;

import com.anhtester.common.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HanldeCheckbox extends BaseTest {
    public static void main(String[] args) {

        createBrowser();

        driver.get("https://demo.seleniumeasy.com/basic-checkbox-demo.html");

        //Kiểm tra đã chọn hay chưa
        boolean checkCheckbox1 = driver.findElement(By.xpath("//input[@id='isAgeSelected']")).isSelected();
        System.out.println(checkCheckbox1);
        //Click chọn Checkbox
        driver.findElement(By.xpath("//input[@id='isAgeSelected']")).click();
        //Kiểm tra đã chọn hay chưa
        boolean checkCheckbox2 = driver.findElement(By.xpath("//input[@id='isAgeSelected']")).isSelected();
        System.out.println(checkCheckbox2);

        boolean checkMessageDisplayed = driver.findElement(By.xpath("//div[@id='txtAge']")).isDisplayed();
        System.out.println("Message Displayed: " + checkMessageDisplayed);
        System.out.println(driver.findElement(By.xpath("//div[@id='txtAge']")).getText());

        //Handle Multi checkbox

        List<WebElement> listCheckboxDefault = driver.findElements(By.xpath("//div[normalize-space()='Multiple Checkbox Demo']/following-sibling::div//input[@type='checkbox']"));

        for (int i = 0; i < listCheckboxDefault.size(); i++) {
            System.out.println("Checkbox vị trí thứ " + (i + 1) + ": " + listCheckboxDefault.get(i).isSelected());
        }

        driver.findElement(By.xpath("//label[normalize-space()='Option 1']")).click();
        driver.findElement(By.xpath("//label[normalize-space()='Option 2']")).click();

        List<WebElement> listCheckboxAfter = driver.findElements(By.xpath("//div[normalize-space()='Multiple Checkbox Demo']/following-sibling::div//input[@type='checkbox']"));

        for (int i = 0; i < listCheckboxAfter.size(); i++) {
            System.out.println("Checkbox vị trí thứ " + (i + 1) + ": " + listCheckboxAfter.get(i).isSelected());
        }

        //Cách 2 dùng trực tiếp index với đoạn Xpath cụ thể

        for (int i = 0; i < listCheckboxDefault.size(); i++) {
            System.out.println("Vị trí thứ " + (i + 1) + ": " + driver.findElement(By.xpath("(//div[normalize-space()='Multiple Checkbox Demo']/following-sibling::div//input[@type='checkbox'])[" + (i + 1) + "]")).isSelected());
        }

        closeBrowser();

    }
}
